package dev.dumitru.classworkHome;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        try {
            int[] ar00 = new int[15];
            final int DIGIT_BOUND = 48;
            try (FileInputStream fis = new FileInputStream("save.out")) {
                fis.read();

                for (int i = 0; i < ar00.length; i++) {
                    ar00[i] = fis.read() - DIGIT_BOUND;
                    fis.read();
                }
            }
            System.out.println("Array from 'save.out': " + Arrays.toString(ar00));
            int[] ar10 = new int[15];
            try (FileInputStream fis = new FileInputStream("save0.out")) {
                int b;
                int i = 0;

                while ((b = fis.read()) != -1) {
                    if (b != 0) {
                        ar10[i++] = b;
                    }
                }
            }
            System.out.println("Array from 'save0.out': " + Arrays.toString(ar10));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
