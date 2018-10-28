package Algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 25, 55};
        System.out.println(search(arr, arr.length, 8));
    }

    private static int search(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}
