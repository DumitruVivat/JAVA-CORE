package dev.dumitru.classworkHome;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3 {

    public static void main(String[] args) {
        try {
            replaceCharacterInFile("save.out", ',', '!', "Main.java");
            replaceSubstringInFile("save.out", "Hello", "Goodbye", "Main.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void replaceCharacterInFile(String inputFile, char what, char to, String outputFile) throws IOException {
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            int i;
            while ((i = fis.read()) != -1) {
                if (i == what) {
                    fos.write(to);
                } else {
                    fos.write(i);
                }
            }
        }
    }
    private static void replaceSubstringInFile(String inputFile, String search, String replace, String outputFile) throws IOException {
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            int ch;
            StringBuilder sb = new StringBuilder();

            while ((ch = fis.read()) != -1) {
                sb.append((char) ch);
                if (sb.length() == search.length()) {
                    if (sb.toString().equals(search)) {
                        fos.write(replace.getBytes());
                        sb.delete(0, search.length());
                    } else {
                        fos.write(sb.charAt(0));
                        sb.deleteCharAt(0);
                    }
                }
            }
            fos.write(sb.toString().getBytes());
        }
    }
}

