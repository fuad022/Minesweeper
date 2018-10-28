package Algorithms;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 4;
//        long[] mem = new long[n + 1];
//        Arrays.fill(mem, -1);
//        System.out.println(fibNaive(n, mem));
        System.out.println(fibEffective(n));
    }

//    private static long fibNaive(int n, long[] mem) {
//        if (mem[n] != -1)
//            return mem[n];
//
//        if (n <= 1)
//            return n;
//
////        long result = fibNaive(n - 2, mem) + fibNaive(n - 1, mem);
//        long result1 = fibNaive(n - 2, mem);
//        long result2 = fibNaive(n - 1, mem);
//        long result = result1 + result2;
//        mem[n] = result;
//
//        return result;
//    }
    //0, 1, 1, 2, 3, 5, 8...

    private static long fibEffective(int n) {
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];

        return arr[n];
    }
}
