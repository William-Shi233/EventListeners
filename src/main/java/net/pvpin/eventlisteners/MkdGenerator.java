package net.pvpin.eventlisteners;

import io.github.classgraph.ClassInfo;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author William_Shi
 */
public class MkdGenerator {
    public static String generate(Clazz clazz, ClassInfo info) {
        StringJoiner joiner = new StringJoiner("\n\n");
        joiner.add("---\ndescription: " + info.getSimpleName() + "\n---");
        joiner.add("# " + info.getSimpleName());

        joiner.add("### 继承关系");
        var spaces = new AtomicInteger(1);
        var supers = new ArrayList<>(info.getSuperclasses());
        Collections.reverse(supers);
        supers.forEach(superClazz ->
                joiner.add("    ".repeat(spaces.getAndAdd(1)) + "=>  " + superClazz.getName()));
        joiner.add("    ".repeat(spaces.get()) + "=>  " + info.getName());

        joiner.add("### 类描述");
        var clazzDocLines = Arrays.asList(clazz.doc.trim().split("\\n"));
        clazzDocLines = clazzDocLines.stream().filter(line -> !line.isBlank()).map(line -> "> " + line).collect(Collectors.toList());
        var clazzDocLinesInQuote = String.join("\n>\n", clazzDocLines);
        if (!clazzDocLinesInQuote.isBlank()) {
            joiner.add(clazzDocLinesInQuote);
        }

        if (!clazz.methods.isEmpty()) {
            joiner.add("### 方法列表");
            clazz.methods.forEach(method -> {
                joiner.add("#### " + method.name);
                joiner.add("方法声明: " + method.declaration);
                joiner.add("方法签名: " + method.descriptor);
                var methodDocLines = Arrays.asList(method.doc.trim().split("\\n"));
                methodDocLines = methodDocLines.stream().filter(line -> !line.isBlank()).map(line -> "> " + line).collect(Collectors.toList());
                var methodDocLinesInQuote = String.join("\n>\n", methodDocLines);
                if (!methodDocLinesInQuote.isBlank()) {
                    joiner.add(methodDocLinesInQuote);
                }
            });
        }

        if (clazz.enumeration != null) {
            joiner.add("### 枚举: " + clazz.enumeration.name);
            var enumDocLines = Arrays.asList(clazz.enumeration.doc.trim().split("\\n"));
            enumDocLines = enumDocLines.stream().filter(line -> !line.isBlank()).map(line -> "> " + line).collect(Collectors.toList());
            var enumDocLinesInQuote = String.join("\n>\n", enumDocLines);
            if (!enumDocLinesInQuote.isBlank()) {
                joiner.add(enumDocLinesInQuote);
            }
            for (EnumConst cst : clazz.enumeration.consts) {
                joiner.add("#### " + cst.name);
                var enumCstDocLines = Arrays.asList(cst.doc.trim().split("\\n"));
                enumCstDocLines = enumCstDocLines.stream().filter(line -> !line.isBlank()).map(line -> "> " + line).collect(Collectors.toList());
                var enumCstDocLinesInQuote = String.join("\n>\n", enumCstDocLines);
                if (!enumCstDocLinesInQuote.isBlank()) {
                    joiner.add(enumCstDocLinesInQuote);
                }
            }
        }
        return joiner.toString();
    }
}
