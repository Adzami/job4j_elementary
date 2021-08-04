package ru.job4j.array;

import java.util.Arrays;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < (array.length / 2); i++) {
            array[i] += array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
            array[i] = array[i] - array[array.length - 1 - i];
        }
        return array;
    }
}
