package dev.dumitru;

public class Task2 {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        fillDiagonal(matrix);
        printDiagonal(matrix);
    }

    private static void fillDiagonal(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            a[i][i] = 1;
            a[i][a.length - i - 1] = 1;
        }

        if (a.length % 2 != 0) {
            int mid = a.length / 2;
            a[mid][mid] = 1;
        }
    }

    private static void printDiagonal(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
