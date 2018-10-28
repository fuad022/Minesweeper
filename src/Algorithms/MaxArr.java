package Algorithms;

public class MaxArr {
    public static void main(String[] args) {
        int[] arr = {2, 6, 41, 45, 9, 25, 45, 40, 30};
        int max = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] == max) {
                count++;
            }
        }
        System.out.println("Max number is: " + max);
        System.out.println("Max number count is: " + count);
    }
}
