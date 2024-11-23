package dev.dumitru;

import java.util.Arrays;
import java.util.TreeMap;

import static dev.dumitru.Task1.findMax;
import static dev.dumitru.Task1.findMin;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 6, 9, 10, 1, 2, 5, 4, 9, 6, 20};

        System.out.println("Source Array: " + Arrays.toString(array));
        pigeon(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static int[] countSort(int[] array) {
        int[] tmpArray = new int[array.length];

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
//            if (map.containsKey(array[i])) {
//                map.put(array[i], map.get(array[i]) + 1);
//            } else {
//                map.put(array[i], 1);
//            }
        }
//        System.out.println("Map: " + map);

        int count = 0;

        for (Integer key : map.keySet()) {
            for (int j = 0 ; j < map.get(key); j++) {
                tmpArray[count++] = key;
            }
        }
        return tmpArray;
    }
    public static void pigeon(int[] array) {
        final int min = findMin(array);
        final int max = findMax(array);
        int[] freq = new int[max - min + 1];
        for (int i = 0; i < array.length; i++) {
            freq[array[i] - min]++;
        }
        int arrIndex = 0;
        for (int i = 0; i < freq.length; i++) {
            for (int elements = freq[i]; elements > 0; elements--) {
                array[arrIndex++] = i + min;
            }
        }
    }
}
