package net.pvpin.eventlisteners;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.type.TypeParameter;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author William_Shi
 */
public class MethodVisitor extends VoidVisitorAdapter<Object> {
    protected String clazzName;

    protected MethodVisitor(String clazzName) {
        this.clazzName = clazzName;
    }

    @Override
    public void visit(final MethodDeclaration doc, final Object arg) {
        Method method = new Method();
        if (doc.getComment().isPresent()) {
            var docLines = Arrays.asList(doc.getComment().get().getContent().split("\\n"))
                    .stream().map(line -> line.replace("*", "").trim())
                    .collect(Collectors.toList());
            method.doc = String.join("\n", docLines);
        }
        method.name = doc.getNameAsString();
        method.declaration = doc.getDeclarationAsString();
        try {
            method.descriptor = doc.toDescriptor();
        } catch (Exception ex) {
            method.descriptor = "Error generating signature.";
        }
        ClazzParser.CLAZZ_MAP.get(clazzName).methods.add(method);
    }

}
