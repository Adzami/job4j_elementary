package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean i : data) {
            if (data[0] != i) {
                result = false;
                break;
            }
        }
        return result;
    }
}
