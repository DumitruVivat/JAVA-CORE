package dev.dumitru.classwork;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
//            writeToFile(writeZero(array));
            int[] arr = readFile("src/main/resources/test.txt");
            for (int value : arr) {
                System.out.println(value );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void writeToFile(String string) throws IOException {

        try(FileWriter fileWriter = new FileWriter("src/main/resources/test.txt")) {
            fileWriter.write(string);
        }
    }

    public static String writeZero(int[] array) throws IOException {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length -1; i++) {
            builder.append(array[i]).append("0");
        }
        return builder.toString();
    }

    public static int[] readFile(String path) throws IOException {
        try (FileReader fileReader = new FileReader(path)) {
            ArrayList<Integer> arary = new ArrayList<>();
            int n;
            boolean flag = true;
            while ((n = fileReader.read()) != -1) {
                char temp = (char) n;
                if (temp == '0' && flag)
                    flag = false;
                if (temp != '0' || (temp == '0' && flag)) {
                    flag = true;
                    try {
                        arary.add(Integer.parseInt(String.valueOf(temp)));
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
            }
            int[] result = new int[arary.size()];
            int index = 0;
            for (Integer integer : arary) {
                result[index++] = integer.intValue();
            }
            return result;
        }
    }
}
