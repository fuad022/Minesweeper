package Algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int key = 50;
        int result = Arrays.binarySearch(arr, key);
        if (result < 0)
            System.out.println("Element not found!" + result);
        else
            System.out.println("Element is found at index: " + result);
    }
}
