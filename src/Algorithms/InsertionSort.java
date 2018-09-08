package Algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = {10, 34, 2, 56, 7, 67, 88, 42};
//        int[] arr2 = insertionSort.doInsertionSort(arr1);
        insertionSort.doInsertionSort(arr);
        System.out.println(Arrays.toString(arr));
//        for (int i : arr2) {
//            System.out.print(i);
//            System.out.print(" ");
//        }
    }

    private void doInsertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
//        return input;
    }
}
