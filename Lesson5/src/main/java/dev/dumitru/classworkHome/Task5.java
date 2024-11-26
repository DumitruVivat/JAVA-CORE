package dev.dumitru.classworkHome;

import java.nio.file.*;
import java.io.IOException;

public class Task5 {
    public static void main(String[] args) {
        String[] a = {"Main.java", "a.txt"};

        for (String fileName : a) {
            Path file = Path.of(fileName);
            if (Files.exists(file)) {
                try {
                    Files.move(file, Paths.get("pre_" + file), StandardCopyOption.REPLACE_EXISTING);
                    System.out.printf("File '%s' was successfully moved to 'pre_%s'.%n", fileName, fileName);
                } catch (IOException e) {
                    System.out.printf("Error moving file '%s': %s%n", fileName, e.getMessage());
                }
            } else {
                System.out.printf("No file with name '%s'%n", fileName);
            }
        }
    }
}

