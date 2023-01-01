package net.pvpin.eventlisteners;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author William_Shi
 */
public class ClazzOrInterfaceVisitor extends VoidVisitorAdapter<Object> {
    @Override
    public void visit(final ClassOrInterfaceDeclaration doc, final Object arg) {
        if (!doc.getComment().isPresent()) {
            return;
        }
        var docLines = Arrays.asList(doc.getComment().get().getContent().split("\\n"))
                .stream().map(line -> line.replace("*", "").trim())
                .collect(Collectors.toList());
        ClazzParser.CLAZZ_MAP.get(doc.getFullyQualifiedName().get()).doc = String.join("\n", docLines);
    }
}
