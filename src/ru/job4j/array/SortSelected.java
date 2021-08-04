package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int indexMin = FindLoop.indexOf(data, min, i, data.length - 1);
            if (indexMin != i) {
                swap(data, indexMin, i);
            }
        }
        return data;
    }

    private static int[] swap(int[] array, int index1, int index2) {
        int trashTmp = array[index1];
        array[index1] = array[index2];
        array[index2] = trashTmp;
        return array;
    }
}
