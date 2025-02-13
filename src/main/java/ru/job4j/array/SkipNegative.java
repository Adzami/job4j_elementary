package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int[] arr : array) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    arr[i] = 0;
                }
            }
        }
        return array;
    }
}
