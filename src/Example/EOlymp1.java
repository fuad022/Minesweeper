package Example;

import java.util.*;

public class EOlymp1 {
    public static void main(String[] args) {

        System.out.println("Enter the number, where interval must be in 10 <= num <= 99");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        if (num >= 10 && num <= 99) {
            System.out.println(num / 10 + " " + num % 10);
        } else {
            System.out.println("Wrong number!!! Number must be in 10 <= num <= 99 interval");
        }
        scanner.close();
        long resultTime = System.currentTimeMillis() - startTime;
        System.out.println("Time: " + resultTime);

    }
}
