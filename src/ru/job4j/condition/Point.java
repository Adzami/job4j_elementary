package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.pow((x2 - x1), 2);
        rsl += Math.pow((y2 - y1), 2);
        return Math.sqrt(rsl);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(3, -5, 1, 2);
        System.out.println("result (3, -5) to (1, 2) " + result);
        result = Point.distance(5, -3, 8, -3);
        System.out.println("result (5, -3) to (8, -3) " + result);
    }
}
