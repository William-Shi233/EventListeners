package net.pvpin.eventlisteners;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.type.TypeParameter;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.symbolsolver.JavaSymbolSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JavaParserTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver;
import com.github.javaparser.utils.SourceRoot;
import io.github.classgraph.ClassInfo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ExecutionException;

/**
 * @author William_Shi
 */
public class ClazzParser {
    private static final String JAVADOC_DIR =
            "C:\\Users/williamshi/Documents/Code/Minecraft/BuildTools/Spigot/Spigot-API/src/main/java/";
    protected static final Map<String, Clazz> CLAZZ_MAP = new HashMap<>(512);

    static {
        SourceRoot root = new SourceRoot(Paths.get(JAVADOC_DIR));
        CombinedTypeSolver combinedTypeSolver = new CombinedTypeSolver(new ReflectionTypeSolver(),
                new JavaParserTypeSolver(JAVADOC_DIR));
        final ParserConfiguration config = new ParserConfiguration()
                .setStoreTokens(true)
                .setSymbolResolver(new JavaSymbolSolver(combinedTypeSolver));
        try {
            root.parse("", config, (Path localPath, Path absolutePath, ParseResult<CompilationUnit> result) -> {
                var compUnit = result.getResult().get();
                new VisitorAssigner().visit(compUnit, null);
                return SourceRoot.Callback.Result.DONT_SAVE;
            });
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static String generate(ClassInfo info) throws IOException, ExecutionException, InterruptedException {
        var srcFileName = info.getName().replace(".", "/") + ".java";
        var srcFile = new File(JAVADOC_DIR + srcFileName);
        if (!srcFile.exists()) {
            System.out.println("Fail to find event: " + info.getName());
            return "";
        }
        return MkdGenerator.generate(CLAZZ_MAP.get(info.getName()), info);
    }

    private static class VisitorAssigner extends VoidVisitorAdapter<Object> {
        @Override
        public void visit(ClassOrInterfaceDeclaration declaration, Object arg) {
            super.visit(declaration, arg);
            var name = declaration.getFullyQualifiedName().get();
            CLAZZ_MAP.put(name, new Clazz());
            new ClazzOrInterfaceVisitor().visit(declaration, arg);
            var nodes = declaration.getChildNodes();
            nodes.forEach(node -> {
                if (node instanceof ClassOrInterfaceDeclaration) {
                    new ClazzOrInterfaceVisitor().visit((ClassOrInterfaceDeclaration) node, null);
                } else if (node instanceof MethodDeclaration) {
                    new MethodVisitor(name).visit((MethodDeclaration) node, null);
                } else if (node instanceof EnumDeclaration) {
                    new EnumVisitor(name).visit((EnumDeclaration) node, null);
                } else if (node instanceof EnumConstantDeclaration) {
                    new EnumVisitor(name).visit((EnumConstantDeclaration) node, null);
                }
            });
        }
    }
}

class Clazz {
    protected String doc = "";
    protected List<Method> methods = new ArrayList<>(16);
    protected Enum enumeration = null;
}

class Method {
    protected String doc = "";
    protected String name = "";
    protected String declaration = "";
    protected String descriptor = "";
}

class Enum {
    protected String doc = "";
    protected String name = "";
    protected List<EnumConst> consts = new ArrayList<>(16);
}

class EnumConst {
    protected String doc = "";
    protected String name = "";
}