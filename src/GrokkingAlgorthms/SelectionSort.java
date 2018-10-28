package GrokkingAlgorthms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {0, 9, 8, -4, 7, 4};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    private static int[] selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int minValue = list[i];
            int minIndex = i;
            for (int j = i; j < list.length; j++) {
                if (list[j] < minValue) {
                    minValue = list[j];
                    minIndex = j;
                }
            }
            if (minValue < list[i]) {
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
        return list;
    }
}
