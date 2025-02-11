package ru.job4j.calculator;

public class Fit {
    public static double idealWeight(int height, Gender gender) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero");
        }

        int base;
        switch (gender) {
            case MALE -> base = 100;
            case FEMALE -> base = 110;
            default -> throw new IllegalStateException("Unexpected value: " + gender);
        }

        return (height - base) * 1.15;
    }

    public static void main(String[] args) {
        System.out.println("Man 180 cm: " + Fit.idealWeight(180, Gender.MALE));
        System.out.println("Woman 170 cm: " + Fit.idealWeight(170, Gender.FEMALE));
    }
}
