package dev.dumitru.classwork;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileExchange {
    public static void main(String[] args) throws IOException {
        writeFile("src/main/resources/test2.txt",'i');
    }
    public static String makeString(String path) throws IOException {
        String string;
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path));) {
            return new String(bufferedInputStream.readAllBytes());
        }
    }

    public static void writeFile(String path, char exchangeChar) throws IOException {
        String string = makeString(path);
        String result = string.replaceAll(String.valueOf(exchangeChar), " ");
        try(FileWriter writer = new FileWriter(path)) {
            writer.write(result);
        }
    }
}
