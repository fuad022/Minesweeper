package SimpleExer;

import java.io.PrintWriter;
import java.util.Scanner;

public class Simple {

    //Алгоритм Евклида.
    public static void main(String[] args) {

        // Для считывания воспользуемся классом Scanner
        // Для вывода - классом PrintWriter
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);

        System.out.println("a: ");
        int a = scanner.nextInt();
        System.out.println("b: ");
        int b = scanner.nextInt();

        printWriter.println(gcd(a, b));

        // После выполнения программы необходимо закрыть
        // потоки ввода и вывода
        scanner.close();
        printWriter.close();

    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        } else {
            return gcd(Math.abs(b), Math.abs(a) % Math.abs(b));
        }
    }
}
