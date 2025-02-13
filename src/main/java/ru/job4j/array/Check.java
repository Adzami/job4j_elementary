package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int j = 1; j < data.length; j++) {
            if (data[0] != data[j]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
