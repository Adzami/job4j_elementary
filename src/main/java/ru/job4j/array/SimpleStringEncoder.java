package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol != input.charAt(i)) {
                result += symbol;
                result = counter > 1 ? result + counter : result;
                symbol = input.charAt(i);
                counter = 1;
            } else {
                counter++;
            }
        }
        result += symbol;
        result = counter > 1 ? result + counter : result;
        return result;
    }
}