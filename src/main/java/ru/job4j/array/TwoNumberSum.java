package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        while (j < array.length) {
            if (array[i] + array[j] == target) {
                return new int[] {i, j};
            }
            if (array[i] + array[j] > target) {
                i++;
                j = i + 1;
            }
            if (j == array.length - 1 && i < array.length - 1) {
                i++;
                j = i + 1;
            }
            j++;
        }
        return new int[0];
    }
}