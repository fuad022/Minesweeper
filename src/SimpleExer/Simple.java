package SimpleExer;

import java.io.PrintWriter;
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
    ////////////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        int i = 1221;
//        String a = Integer.toString(i);
////        String a = "12";
//        StringBuffer sb = new StringBuffer(a).reverse();
//        String strRev = sb.toString();
//        System.out.println(strRev);
//        if (strRev.equalsIgnoreCase(a)) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not palindrome");
//        }
//    }
    ////////////////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        String s = "2551";
//        Simple simple = new Simple();
//        simple.isPalindrome(s);
////        int n = s.length();
////        for (int i = 0; i < (n / 2); ++i) {
////            if (s.charAt(i) != s.charAt(n - i - 1)) {
////                System.out.println("Not Palindrome");
////            } else {
////                System.out.println("Palindrome");
////            }
////        }
//    }
//
//    private boolean isPalindrome(String s) {
//        int n = s.length();
//        for (int i = 0; i < (n / 2); ++i) {
//            if (s.charAt(i) != s.charAt(n - i - 1)) {
//                System.out.println("Not palindrome");
//                return false;
//            }
//        }
//        System.out.println("Palindrome");
//        return true;
//    }
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

//    public static void main(String[] args) {
//        int[] arr = new int[]{2, 6, 41, 45, 9, 25, 45, 40, 30};
//        int max = arr[0];
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            } else if (arr[i] == max) {
//                count++;
//            }
//        }
//        System.out.println("Max number is: " + max);
//        System.out.println("Max number count is: " + count);
//    }
    ///////////////////////////////////////////////////////////////////////////////

//    public static void main(String[] args) {
//        byte i = 2;
//        byte j = 2;
//        byte k = (byte) (i * j);
//        System.out.println(k);
//    }
    ///////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
//        Object o1 = null;
//        Object o2 = null;
        Object o1 = new Object();
        Object o2 = new Object();
//        Integer o1 = new Integer(5);
//        Integer o2 = new Integer(5);
        System.out.println(o1.equals(o2));
        System.out.println(o1 == o2);
    }
}

//class Main {
//    public static void main(String[] args) {
//
//    }
//}
