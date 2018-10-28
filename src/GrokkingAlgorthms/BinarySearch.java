package GrokkingAlgorthms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(bs(arr, 3));
    }

    private static int bs(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high);
            int guess = arr[mid];
            if (guess > item) {
                high = mid - 1;
            } else if (guess < item) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
