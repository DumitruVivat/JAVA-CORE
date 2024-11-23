package dev.dumitru;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 0, 5, 7, 8};

        for (int numb : array) {
            System.out.print(numb + " ");
        }
        System.out.println();
        System.out.println("Min value = " + findMin(array));
        System.out.println("Max value = " + findMax(array));

    }

    public static int findMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
    public static int findMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
