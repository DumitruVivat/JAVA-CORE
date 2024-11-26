package dev.dumitru.classworkHome;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FileManipulation {

    // Constants
    private static final Random rnd = new Random();
    private static final int CHAR_BOUND_L = 65;
    private static final int CHAR_BOUND_H = 90;
    private static final int FILES_AMOUNT = 10;
    private static final int WORDS_AMOUNT = 5;
    private static final int WORD_LENGTH = 10;
    private static final String WORD_TO_SEARCH = "Dumitru";

    public static void main(String[] args) {
        try {
            String[] fileNames = new String[FILES_AMOUNT];
            for (int i = 0; i < fileNames.length; i++) {
                fileNames[i] = "test" + i + ".txt";
            }

            for (int i = 0; i < fileNames.length; i++) {
                if (i < 3) {
                    writeFileContents(fileNames[i], 100);
                } else {
                    writeFileContents(fileNames[i], WORDS_AMOUNT, WORD_LENGTH);
                    System.out.println("First task results are in test0.txt, test1.txt, and test2.txt");
                }
            }
            concatenate(fileNames[0], fileNames[1], "concatenated_output.txt");
            System.out.println("Concatenation complete! Output saved in concatenated_output.txt");

            for (String fileName : fileNames) {
                if (isInFile(fileName, WORD_TO_SEARCH)) {
                    System.out.println("The word '" + WORD_TO_SEARCH + "' found in " + fileName);
                }
            }

            for (String fileName : fileNames) {
                if (fileScanner(fileName, WORD_TO_SEARCH)) {
                    System.out.println("The word '" + WORD_TO_SEARCH + "' found in " + fileName);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String generateSymbols(int amount) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < amount; i++) {
            sb.append((char) (CHAR_BOUND_L + rnd.nextInt(CHAR_BOUND_H - CHAR_BOUND_L)));
        }
        return sb.toString();
    }
    private static void writeFileContents(String fileName, int length) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(generateSymbols(length).getBytes());
        }
    }
    private static void writeFileContents(String fileName, int words, int length) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            for (int i = 0; i < words; i++) {
                if (rnd.nextInt(WORDS_AMOUNT) == WORDS_AMOUNT / 2) {
                    fos.write(WORD_TO_SEARCH.getBytes());
                } else {
                    fos.write(generateSymbols(length).getBytes());
                }
                fos.write(' ');
            }
        }
    }
    private static void concatenate(String file_in1, String file_in2, String file_out) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file_out)) {
            int ch;
            try (FileInputStream fis1 = new FileInputStream(file_in1)) {
                while ((ch = fis1.read()) != -1) {
                    fos.write(ch);
                }
            }
            try (FileInputStream fis2 = new FileInputStream(file_in2)) {
                while ((ch = fis2.read()) != -1) {
                    fos.write(ch);
                }
            }
        }
    }
    private static boolean isInFile(String fileName, String search) throws IOException {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int ch;
            StringBuilder sb = new StringBuilder();
            while ((ch = fis.read()) != -1 && sb.length() < search.length()) {
                sb.append((char) ch);
            }

            do {
                if (sb.toString().equals(search)) {
                    return true;
                }
                sb.deleteCharAt(0);
                sb.append((char) ch);
            } while ((ch = fis.read()) != -1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    private static boolean fileScanner(String fileName, String word) throws IOException {
        try (Scanner sc = new Scanner(new FileInputStream(fileName))) {
            word = word.toLowerCase();
            while (sc.hasNext()) {
                String line = sc.nextLine().toLowerCase();
                if (line.contains(word)) {
                    return true;
                }
            }
        }
        return false;
    }
}
