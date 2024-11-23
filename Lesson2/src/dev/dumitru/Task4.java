package dev.dumitru;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {1 ,2 ,3};

        array = addElementSecond(array,3);
        printArray(array);
        array = addElementSecond(array,4);
        printArray(array);
        array = addElementSecond(array,5);
        printArray(array);
        array = addElementSecond(array,6);
        printArray(array);
    }


    private static int[] addElement(int[] array, int element) {
        int[] newArray = new int[array.length + 1];

        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[array.length] = element;

        return newArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int[] addElementSecond(int[] array, int element) {
        int[] newArray = new int[array.length + 1];

        System.arraycopy(array, 0, newArray, 0, array.length);

        newArray[array.length] = element;
        return newArray;
    }
}
