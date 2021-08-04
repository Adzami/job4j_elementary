package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Ages length = " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Surnames length = " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Prices length = " + prices.length);
        String[] names = new String[4];
        names[0] = "Vasya";
        names[1] = "Masha";
        names[2] = "Vova";
        names[3] = "Lena";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
