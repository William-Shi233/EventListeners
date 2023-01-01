package net.pvpin.eventlisteners;


import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.EnumConstantDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author William_Shi
 */
public class EnumVisitor extends VoidVisitorAdapter<Object> {
    protected String clazzName;

    protected EnumVisitor(String clazzName) {
        this.clazzName = clazzName;
    }

    @Override
    public void visit(final EnumDeclaration doc, final Object arg) {
        Enum enumaration = ClazzParser.CLAZZ_MAP.get(clazzName).enumeration == null ?
                new Enum() : ClazzParser.CLAZZ_MAP.get(clazzName).enumeration;
        if (doc.getComment().isPresent()) {
            var docLines = Arrays.asList(doc.getComment().get().getContent().split("\\n"))
                    .stream().map(line -> line.replace("*", "").trim())
                    .collect(Collectors.toList());
            enumaration.doc = String.join("\n", docLines);
        }
        enumaration.name = doc.getNameAsString();
        ClazzParser.CLAZZ_MAP.get(clazzName).enumeration = enumaration;
        doc.getChildNodes().stream()
                .filter(node -> node instanceof EnumConstantDeclaration)
                .map(node -> (EnumConstantDeclaration) node)
                .forEach(node -> this.visit(node, null));
    }

    @Override
    public void visit(final EnumConstantDeclaration doc, final Object arg) {
        Enum enumaration = ClazzParser.CLAZZ_MAP.get(clazzName).enumeration == null ?
                new Enum() : ClazzParser.CLAZZ_MAP.get(clazzName).enumeration;
        EnumConst enumConst = new EnumConst();
        if (doc.getComment().isPresent()) {
            var docLines = Arrays.asList(doc.getComment().get().getContent().split("\\n"))
                    .stream().map(line -> line.replace("*", "").trim())
                    .collect(Collectors.toList());
            enumConst.doc = String.join("\n", docLines);
        }
        enumConst.name = doc.getNameAsString();
        enumaration.consts.add(enumConst);
        ClazzParser.CLAZZ_MAP.get(clazzName).enumeration = enumaration;
    }
}
