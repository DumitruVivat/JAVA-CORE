package dev.dumitru.homework;

import java.io.*;
import java.nio.file.*;
import java.util.Arrays;

public class Task {

    public static void main(String[] args) {
        try {
            createBackupDirectory();
            copyFilesToBackup();

            int[] ar2 = {0, 1, 2, 3, 0, 1, 2, 3, 0};
            writeArrayToFile(ar2);

            int[] ar20 = readArrayFromFile();
            System.out.println(Arrays.toString(ar20));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createBackupDirectory() throws IOException {
        Path backupDir = Path.of("./backup");
        if (!Files.exists(backupDir)) {
            Files.createDirectory(backupDir);
            System.out.println("Directory 'backup' created.");
        } else {
            System.out.println("Directory 'backup' already exists.");
        }
    }

    private static void copyFilesToBackup() throws IOException {
        DirectoryStream<Path> dir = Files.newDirectoryStream(Path.of("."));
        for (Path file : dir) {
            if (Files.isDirectory(file)) continue;
            Path destination = Path.of("./backup", file.getFileName().toString());
            Files.copy(file, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.printf("Copied '%s' to 'backup/%s'.%n", file, file.getFileName());
        }
    }

    private static void writeArrayToFile(int[] ar2) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("save1.out")) {
            for (int b = 0; b < 3; b++) {
                byte wr = 0;
                for (int v = 0; v < 3; v++) {
                    wr += (byte) (ar2[3 * b + v] << (v * 2));
                }
                fos.write(wr);
            }
            fos.flush();
            System.out.println("Array written to 'save1.out'.");
        }
    }

    private static int[] readArrayFromFile() throws IOException {
        int[] ar20 = new int[9];
        try (FileInputStream fis = new FileInputStream("save1.out")) {
            int b;
            int i = 0;
            while ((b = fis.read()) != -1) {
                for (int v = 0; v < 3; ++v) {
                    ar20[i++] = (b >> (v * 2)) & 0x3;
                }
            }
        }
        return ar20;
    }
}

