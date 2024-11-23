package dev.dumitru;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 1, 2, 1};
        int[] array2 = {2, 1, 1, 2, 1};
        int[] array3 = {10, 1, 2, 3, 4};
        System.out.println(checkBalance2(array1));
        System.out.println(checkBalance2(array2));
        System.out.println(checkBalance2(array3));
    }

    private static boolean checkBalance(int[] a) {
        int left = 0;
        for (int i = 0; i < a.length - 1; i++) {
            left += a[i];
            int right = 0;
            for (int j = i + 1; j < a.length; j++) {
                right += a[j];
            }
            if (left == right) return true;
        }
        return false;
    }
    public static boolean checkBalance1(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if (sum % 2 != 0) return false;
        int left = 0;
        for (int i = 0; i < array.length; i++) {
            left += array[i];
            sum -= array[i];
            if (left == sum) return true;
        }
        return false;
    }

    public static boolean checkBalance2(int[] array) {
        int lbound = 0;
        int rbound = array.length - 1;
        int left = 0;
        int right = 0;
        while(lbound <= rbound) {
            if (left > right) {
                right += array[rbound--];
            } else {
                left += array[lbound++];
            }
        }
        return left == right;
    }
}
