package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        // Исключения из правила
        if (number == 1 || number == 0) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                // return false; не нужен тут break...
                prime = false;
                break;
            }
        }
        return prime;
    }
}
