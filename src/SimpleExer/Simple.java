package SimpleExer;

import java.io.*;
import java.net.*;
import java.time.LocalDate;
import java.util.*;
import java.util.LinkedList;

public class Simple {

//    //Алгоритм Евклида.
//    public static void main(String[] args) {
//
//        // Для считывания воспользуемся классом Scanner
//        // Для вывода - классом PrintWriter
//        Scanner scanner = new Scanner(System.in);
//        PrintWriter printWriter = new PrintWriter(System.out);
//
//        System.out.println("a: ");
//        int a = scanner.nextInt();
//        System.out.println("b: ");
//        int b = scanner.nextInt();
//
//        printWriter.println(gcd(a, b));
//
//        // После выполнения программы необходимо закрыть
//        // потоки ввода и вывода
//        scanner.close();
//        printWriter.close();
//
//    }
//
//    private static int gcd(int a, int b) {
//        if (b == 0) {
//            return Math.abs(a);
//        } else {
//            return gcd(Math.abs(b), Math.abs(a) % Math.abs(b));
//        }
//    }

    ///////////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        int i = 0;
//        Simple s = new Simple();
//        System.out.println(i++ + s.operation(i));
//        System.out.println(i);
//    }
//
//    public int operation(int i) {
//        System.out.println(i++);
//        return i;
//    }

//    /////////////////////////////////////////////////////////////////////////////////////////
//    private String name;
//
//    public Simple(String name) {
//        this.name = name;
//    }
//    /////////////////////////////////////////////////////////////////////////////////////////
//
//    public static void main(String[] args) {
////        int i = 0;
////        i++;
////        System.out.print(i);
////        i = i++;
////        System.out.println(i);
////        System.out.println(1 | 4);
//        //////////////////////////////////////
////        for (int j = 2147483645; ++j > 0;) {
////            System.out.println(j);
////        }
//        //////////////////////////////////////////////
//        Simple simple1 = new Simple("Tom");
//        Simple simple2 = new Simple("Tom");
//        System.out.println(simple1 == simple2);
//        System.out.println(simple1.equals(simple2));
//        //////////////////////////////////////////////

//    }
    ////////////////////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        try {
//            new Simple().divide();
//        } catch (Error er) {
//            System.out.println("main catch");
//        }
//    }
//
//    void divide() throws Error {
//        try {
//            int i = 1 / 0;
//        } catch (RuntimeException re) {
//            System.out.println("catch");
//            throw new CustomException();
//        } finally {
//            System.out.println("finally");
//        }
//    }
    ////////////////////////////////////////////////////////////////////////////////////////////////

//    int speed;
//    public Simple() {
//        speed = 90;
//    }
//    abstract void accelerate(int deltaSpeed);
    ////////////////////////////////////////////////////////////////////////////////////////////////

//    int i = 3;
//
//    public static void main(String[] args) {
//        System.out.println(i++);
//    }
    ////////////////////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        int x = Integer.MIN_VALUE;
//        System.out.println(x);
//        System.out.println(-x);
//    }
    ////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(null);
//        for (Integer i : list) {
//            System.out.println(i);
//        }
    //////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        System.out.println(args.length);
//    }
    //////////////////////////////////////////////////////////////////////////////////

//    static {
//        System.out.println("Hello!");
//        System.exit(0);
//    }
    //////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        System.out.println(010 > 9);
//    }
    //////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        try {
//            int k = Integer.parseInt(args[1]);
//            System.out.println(args[k]);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
    //////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        ArrayList<Integer> array = new ArrayList<Integer>(2);
//        array.add(5);
//        System.out.println("Индекс 1-ого элемента листа: " + array.indexOf(5));
//        array.add(6);
//        System.out.println("Индекс 2-ого элемента листа: " + array.indexOf(6));
//        array.add(1, 7);
//        System.out.println("Индекс 3-его элемента листа: " + array.indexOf(7));
//        System.out.println("Число 6 переместилось с индекса 1 на индекс 2");
//        System.out.println("Итоговый лист: " + array);
//        System.out.println();
//        System.out.print(array.indexOf(6));
//
//        array.remove(1);
//        System.out.println(array.indexOf(6));
//    }
    ////////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        int limit = 10;
//        int sum = 0;
//
//        int i = 1;
//        for (; i <= limit; ) {
//            sum += i++;
//        }
//        System.out.println(sum);
//    }
    ////////////////////////////////////////////////////////////////////////////////////

//    int i = getInt();
//    int k = 20;
////    int i = getInt();
//
//    public int getInt() {
//        return k + 1;
//    }
//
//    public static void main(String[] args) {
//        Simple s = new Simple();
//        System.out.println(s.i + " " + s.k);
//    }
    /////////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        try {
//            int i = 5;
//        } catch (Exception e) {
//            System.out.println("catch");
//        } finally {
//            System.out.println("finally");
//        }
//    }
    /////////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        int x = 0;
//        int y = 10;
//        do {
//            y--;
//            ++x;
//        } while (x < 5);
//        System.out.println(x + ", " + y);
//    }
    /////////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        boolean b = true;
//        int x = 0;
//
//        do {
//            if (x++ > 5)
//                b = false;
//            System.out.print(x);
//        } while (b);
//    }
    //////////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        int a = 5;
//        a = a != 0 ? a > 1 ? a >> 2 : a << 2 : a < 1 ? a << 2 : a >> 2;
//        System.out.println(a);
//    }
    //////////////////////////////////////////////////////////////////////////////////////
//
//        int How() {
//            int x = 1;
//            int total = 0;
//            for (int a = 1; a <= 2; ++a)
//                total += ++x;
//            return total;
//        }
//
//    public static void main(String[] args) {
//        Simple simple = new Simple();
//        simple.How();
//    }
    ///////////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        int a = 2112;
//        String aStr = Integer.toString(a);
//        int[] newA = new int[aStr.length()];
//
//        for (int i = 0; i < aStr.length(); i++) {
//            newA[i] = aStr.charAt(i) - '0';
//            System.out.print(newA[i] + " ");
//        }
//    }
    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        int num = 121, reversedInteger = 0, remainder, originalInteger;
//
//        originalInteger = num;
//
//        // reversed integer is stored in variable
//        while (num != 0) {
//            remainder = num % 10;
//            reversedInteger = reversedInteger * 10 + remainder;
//            num /= 10;
//        }
//
//        // palindrome if orignalInteger and reversedInteger are equal
//        if (originalInteger == reversedInteger)
//            System.out.println(originalInteger + " is a palindrome.");
//        else
//            System.out.println(originalInteger + " is not a palindrome.");
//    }
    ///////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
////        LinkedList
//    }
    ///////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//        System.out.println("1st day is: " + calendar.getFirstDayOfWeek());
//        int day = calendar.getFirstDayOfWeek();
//        switch (day) {
//            case (1):
//                System.out.println("Sunday");
//                break;
//            case (2):
//                System.out.println("Monday");
//                break;
//            case (3):
//                System.out.println("Tuesday");
//                break;
//            case (4):
//                System.out.println("Wednesday");
//                break;
//            case (5):
//                System.out.println("Thrusday");
//                break;
//            case (6):
//                System.out.println("Friday");
//                break;
//            case (7):
//                System.out.println("Saturday");
//                break;
//        }
//    }
    //////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
////        Calendar c = Calendar.getInstance();   // this takes current date
////        c.set(Calendar.DAY_OF_MONTH, 1);
////        System.out.println(c.getTime());
//
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate.withDayOfMonth(1));
//    }
    ///////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        byte i = 2;
//        byte j = 2;
//        byte k = (byte) (i * j);
//        System.out.println(k);
//    }
    ///////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
////        float a = 7.1f;
////        double b = 8.25;
////        int c = 35_000;
////        long d = 1_000_000_000_000L;
////        Object o1 = null;
////        Object o2 = null;
//        Object o1 = new Object();
//        Object o2 = new Object();
////        Integer o1 = new Integer("5");
////        Integer o2 = new Integer("5");
////        String o1 = new String("hello");
////        String o2 = new String("hello");
//        System.out.println(o1.equals(o2));
//        System.out.println(o1 == o2);
//    }
    ////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
////
////        int[] primes = {1, 2, 3, 4, 5};
////        int[] numbers = primes;
////
////        System.out.println(numbers[4]);
//        String s = "acdef";
//        StringBuilder stringBuilder = new StringBuilder(s);
//        stringBuilder.reverse();
//        System.out.println(stringBuilder.toString());
//    }
    /////////////////////////////////////////////////////////////////////////////////

    //    public static void main(String[] args) {
//        int i = 0;
//        int j = 1;
//        System.out.println(i += (j < i) ? (2) : (3));
//    }
    /////////////////////////////////////////////////////////////////////////////////
//    public static void main(String[] bicycle) {
//        System.out.println(bicycle[0]);
//    }
    //////////////////////////////////////////////////////////////////////////////////
//    public static void main(String[] args) {
//        char c1 = '1';
//        char c2 = '\u0031';
//        char c3 = 49;
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);
//        System.out.println(c1 + c2 + c3);
//    }
    //////////////////////////////////////////////////////////////////////////////////

//    public static final int N = 5;
//
//    public static void main(String[] args) {
//        int m[][][] = new int[N][N][N];
//        label:
//        for (int i = 0; i < N; ++i)
//            for (int j = 0; j < N; ++j)
//                for (int k = 0; k < N; ++k) {
//                    m[i][j][k] = i * j * k;
//                    if (m[i][j][k] == 9) {
//                        System.out.print("9 ");
//                        continue label;
//                    }
//                }
//    }
    //////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        label:
//        for (int i = 0; i < 5; ++i) {
//            for (int j = 0; j < 5; ++j) {
//                if (i > 2) break label;
//                System.out.print(j);
//            }
//            System.out.print(" ");
//        }
//    }
    ///////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        int x = 1;
//        int y = 15;
//
//        while (x < 10)
//            y--;
//            x++;
//        System.out.println(x + ", " + y);
//    }
    ///////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        Object ref;
//        while (true)
//            ref = new Object();
//    }
    //////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        System.out.println(sq(2, 10));
//    }
//
//    private static int sq(int a, int b) {
//        int res = a;
//        while (b != 1) {
//            res *= a;
//            b--;
//        }
//        return res;
//    }
    //////////////////////////////////////////////////////////////////////////////////

//    private Simple() {
////        return this;    //конструктор ничего не должен возвращать.
//    }
//
//    public static Simple get() {
//        return new Simple();
//    }
//
//    public static void main(String[] args) {
//        Simple simple1 = get();
//        Simple simple2 = new Simple();
//        System.out.println(simple1);
//        System.out.println(simple2);
//    }
    //////////////////////////////////////////////////////////////////////////////////
//
//    public static void main(String[] args) {
//        byte a = 3;
//        short b = 4;
//        compute(a, b);
//    }
//
//    public static void compute(short x, short y) {
//        System.out.println("Short: " + (x + y) + (x + y));
//    }
    //////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        int a = 2;
//        int b = 3;
//        System.out.println("suma: " + (a + b));
//    }
    //////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        byte a = 40, b = 50;
//        byte sum = (byte)(a + b);
//        System.out.println(sum);
//    }
    //////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
////        int i = 0, j = 5;
//        System.out.println("hello");
//        lab1:
//        return;
////        for (; ; i++) {
////            for (; ; --j)
////                if (i > j)
////                    break lab1;
////        }
////        System.out.println("i = " + i + ", j = " + j);
//    }
    ///////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        String a = "aaa";
//        String b = "aaa";
//        Simple s1 = new Simple();
//        Simple s2 = new Simple();
//        StringBuilder string = new StringBuilder("aaa");
//        StringBuilder stringBuilder1 = new StringBuilder("hello");
//        StringBuilder stringBuilder2 = new StringBuilder("hello");
//        System.out.println(a.equals(string));                        //false
//        System.out.println(stringBuilder1.equals(stringBuilder2));   //false
//        System.out.println(stringBuilder1 == stringBuilder2);        //false
//        System.out.println(stringBuilder1.hashCode());
//        System.out.println(stringBuilder2.hashCode());
//        System.out.println("/////////////////////////////");
//        System.out.println("a: " + a.hashCode());
//        System.out.println("b: " + b.hashCode());
//        System.out.println(a.equals(b));
//        System.out.println("/////////////////////////////");
//        System.out.println("s1: " + s1.hashCode());
//        System.out.println("s2: " + s2.hashCode());
//        System.out.println(s1.equals(s2));
//    }
    ////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        System.out.println(ins());
//    }
//
//    private static int ins() {
//        for (int i = 1; i < 10; i++) {
//            return i;
//        }
//        return 0;
//    }
    /////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.println("*");
            }
        }
    }
}
