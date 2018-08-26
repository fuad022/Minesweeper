package Algorithms;

public class BubbleSort {

    private int[] bSort(int[] arr) {
//        int i, j, tmp;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
//                    arr[j] = arr[j] + arr[j + 1];
//                    arr[j + 1] = arr[j] - arr[j + 1];
//                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {52, 55, 1, 99, 12, 6, 0, 36, 21, 47};
        BubbleSort bubble = new BubbleSort();
        int[] b = bubble.bSort(a);
        for (int x : b) {
            System.out.print(x + " ");
        }
    }
}
