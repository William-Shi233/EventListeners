package net.pvpin.eventlisteners;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Event;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

/**
 * @author William_Shi
 */
public class Main {
    private static final String OUTPUT_DIR = "C:\\Users/williamshi/Documents/Code/EventListeners/docs";
    private static final String SUMMARY_MKD = "C:\\Users/williamshi/Documents/Code/EventListeners/SUMMARY.md";

    public static void main(String[] args) {
        new File(OUTPUT_DIR).mkdirs();
        URL[] urls = new URL[]{
                Event.class.getProtectionDomain().getCodeSource().getLocation()
        };
        var summary = new HashMap<String, List<String>>(512);
        new ClassGraph().addClassLoader(new URLClassLoader(urls))
                .enableAllInfo().scan().getAllClasses()
                .stream().filter(Main::isTargetClass)
                .forEach(info -> {
                    try {
                        var name = info.getName();
                        var simpleName = info.getSimpleName();
                        var pkg = name.split("\\.")[name.split("\\.").length - 2];
                        pkg = String.valueOf(pkg.charAt(0)).toUpperCase() + pkg.substring(1);
                        var pkgDir = new File(OUTPUT_DIR + "/" + pkg);
                        var file = new File(pkgDir, simpleName + ".md");
                        pkgDir.mkdirs();
                        file.createNewFile();
                        Files.writeString(
                                file.toPath(), ClazzParser.generate(info),
                                StandardCharsets.UTF_8, StandardOpenOption.WRITE
                        );
                        if (summary.containsKey(pkg)) {
                            summary.get(pkg).add(simpleName);
                        } else {
                            var list = new ArrayList<String>(64);
                            list.add(simpleName);
                            summary.put(pkg, list);
                        }
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                });
        try {
            var summaryJoiner = new StringJoiner("\n");
            summaryJoiner.add("# Table of contents\n");
            for (Map.Entry<String, List<String>> entry : summary.entrySet()) {
                var list = new ArrayList<>(entry.getValue());
                Collections.sort(list);
                for (String simpleName : list) {
                    summaryJoiner.add("* [" + simpleName + "](docs/" + entry.getKey() + "/" + simpleName + ".md)");
                }
            }
            var summaryFile = new File(SUMMARY_MKD);
            summaryFile.createNewFile();
            Files.writeString(
                    summaryFile.toPath(), summaryJoiner.toString(),
                    StandardCharsets.UTF_8, StandardOpenOption.WRITE
            );
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static boolean isTargetClass(ClassInfo info) {
        if (info.isInnerClass() || info.isAnonymousInnerClass() || info.isEnum()) return false;
        if (!info.extendsSuperclass(Event.class.getName())) return false;
        return !info.getName().contains("paper");
    }
}
