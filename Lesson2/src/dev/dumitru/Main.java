package dev.dumitru;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BigDecimal a = BigDecimal.valueOf(10000);
//
//        Scanner scanner = new Scanner(System.in);
//        BigDecimal b = scanner.nextBigDecimal();
//
//        System.out.println(b.multiply(a));
//        int [] arr = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(arr));
//        shifter(arr, 2);
//        System.out.println(Arrays.toString(arr));
//        shifter(arr, -2);
//        System.out.println(Arrays.toString(arr));

        int[] array = {1, 0, 1, 0, 1, 1, 0};
        change(array);

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    private static void shifter(int[] a, int n) {
        if(a == null || a.length <= 1) return;

        int length = a.length;
        n = n % length;
        if(n < 0) {
            n += length;
        }

        int[] temp = new int[length];

        for (int i = 0; i < length; i++) {
            temp[(i + n) % length] = a[i];
        }

        System.arraycopy(temp, 0, a, 0, length);
    }

    private static void change(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 1 - a[i];
        }
    }
}
