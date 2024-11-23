package dev.homework;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 1, 2, 3, 4};
        int[] array1 = {2, 2, 0};
        int[] array2 = {1, 3, 5};
        int[] array3 = {2, 1, 2, 3, 4, 0, 0};
//        System.out.println(countEvens(array));
//        System.out.println(countEvens(array1));
//        System.out.println(countEvens(array2));

        System.out.println(spread(array));

        System.out.println(zero2(array3));
    }

    public static int countEvens(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int spread(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        return max - min;
    }

    public static boolean zero2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0 && array[i + 1] == 0)
                return true;
        }
        return false;
    }
}
