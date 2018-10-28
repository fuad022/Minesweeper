package Algorithms;

public class ArrSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sum(arr));
    }

    private static int sum(int[] arr) {
        int total = 0;
        for (int a : arr) {
            total += a;
        }
        return total;
    }
}
