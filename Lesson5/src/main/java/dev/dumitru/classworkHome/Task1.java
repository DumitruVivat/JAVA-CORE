package dev.dumitru.classworkHome;

import java.io.FileOutputStream;
import java.io.IOException;

public class Task1 {

    public static void main(String[] args) {

        int[] ar1 = {1, 2, 3, 4, 5, 6, 7, 8, 0, 8, 7, 6, 5, 4, 3};
        int[] ar2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3};
        try {
            writeArrayToFile(ar1, "save.out");
            writeArrayWithSeparatorToFile(ar2, "save1.out", 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void writeArrayToFile(int[] array, String fileName) throws IOException {
        final int DIGIT_BOUND = 48;
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write('[');

            for (int i = 0; i < array.length; i++) {
                fos.write(DIGIT_BOUND + array[i]);
                if (i < array.length - 1) {
                    fos.write(',');
                }
            }
            fos.write(']');
            fos.flush();
        }
    }

    private static void writeArrayWithSeparatorToFile(int[] array, String fileName, int separator) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            for (int i = 0; i < array.length; i++) {
                fos.write(array[i]);
                fos.write(separator);
            }
            fos.flush();
        }
    }
}
