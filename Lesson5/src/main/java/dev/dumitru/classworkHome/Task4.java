package dev.dumitru.classworkHome;

import java.io.File;
import java.io.IOException;

public class Task4 {

    public static void main(String[] args) {
        try {
            listFilesInCurrentDirectory();
            printContents(".");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void listFilesInCurrentDirectory() throws IOException {
        File path = new File(new File(".").getCanonicalPath());
        File[] dir = path.listFiles();

        if (dir != null) {
            for (int i = 0; i < dir.length; i++) {
                if (dir[i].isDirectory()) {
                    continue;
                }
                System.out.println(dir[i]);
            }
        }
    }

    private static void printContents(String path) throws IOException {
        File fullPath = new File(new File(path).getCanonicalPath());
        File[] dir = fullPath.listFiles();
        if (dir != null) {
            for (int i = 0; i < dir.length; i++) {
                if (dir[i].isDirectory()) {
                    printContents(dir[i].toString());
                }
                System.out.println(dir[i]);
            }
        }
    }
}
