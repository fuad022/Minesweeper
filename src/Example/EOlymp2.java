package Example;

import java.util.Scanner;

public class EOlymp2 {
    public static void main(String[] args) {
        System.out.println("Enter the number (0 <= n <= 2*10^9):");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        if (num >= 0 && num <= 2 * (int)Math.pow(10, 9)) {
            int numChar = String.valueOf(Math.abs(num)).length();
            System.out.println(numChar);
        } else {
            System.out.println("The number not from interval 0 <= n <= 2*10^9");
        }
        scanner.close();
        long resultTime = System.currentTimeMillis() - startTime;
        System.out.println("Time: " + resultTime);
    }
}
