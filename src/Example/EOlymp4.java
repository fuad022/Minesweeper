package Example;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class EOlymp4 {
    public static void main(String[] args) throws ParseException {

        Number num;

        DecimalFormat numberFormat = new DecimalFormat("#.###");
        NumberFormat format = NumberFormat.getInstance(Locale.getDefault());

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter x1 (x1 <= 10^9):");
//        double x1 = sc.nextDouble();
//        System.out.println(numberFormat.format(x1));
        String sx1 = numberFormat.format(sc.nextDouble());
        num = format.parse(sx1);
        double x1 = num.doubleValue();
//        System.out.println(x1);

//        System.out.println("Enter y1 (y1 <= 10^9):");
//        double y1 = sc.nextDouble();
//        System.out.println(numberFormat.format(y1));
        String sy1 = numberFormat.format(sc.nextDouble());
        num = format.parse(sy1);
        double y1 = num.doubleValue();
//        System.out.println(y1);

//        System.out.println("Enter r1 (r1 <= 10^9):");
//        double r1 = sc.nextDouble();
//        System.out.println(numberFormat.format(r1));
        String sr1 = numberFormat.format(sc.nextDouble());
        num = format.parse(sr1);
        double r1 = num.doubleValue();
//        System.out.println(r1);

//        System.out.println("Enter x2 (x2 <= 10^9):");
//        double x2 = sc.nextDouble();
//        System.out.println(numberFormat.format(x2));
        String sx2 = numberFormat.format(sc.nextDouble());
        num = format.parse(sx2);
        double x2 = num.doubleValue();
//        System.out.println(x2);

//        System.out.println("Enter y2 (y2 <= 10^9):");
//        double y2 = sc.nextDouble();
//        System.out.println(numberFormat.format(y2));
        String sy2 = numberFormat.format(sc.nextDouble());
        num = format.parse(sy2);
        double y2 = num.doubleValue();
//        System.out.println(y2);

//        System.out.println("Enter r2 (r2 <= 10^9):");
//        double r2 = sc.nextDouble();
//        System.out.println(numberFormat.format(r2));
        String sr2 = numberFormat.format(sc.nextDouble());
        num = format.parse(sr2);
        double r2 = num.doubleValue();
//        System.out.println(r2);

//        long startTime = System.currentTimeMillis();
//
//        System.out.println("x1 = " + x1);
//        System.out.println("y1 = " + y1);
//        System.out.println("r1 = " + r1);
//        System.out.println("x2 = " + x2);
//        System.out.println("y2 = " + y2);
//        System.out.println("r2 = " + r2);

//        double d = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        String sd = numberFormat.format(Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))));
        num = format.parse(sd);
        double d = num.doubleValue();
//        double d = Math.sqrt((Math.pow((Double.parseDouble(x2) - Double.parseDouble(x1)), 2) + Math.pow((y2 - y1), 2)));
//        System.out.println("d = " + numberFormat.format(d));
//        System.out.println("d = " + d);

        if (x1 >= Math.abs(Math.pow(10, 9)) || y1 >= Math.abs(Math.pow(10, 9)) || r1 >= Math.abs(Math.pow(10, 9)) ||
            x2 >= Math.abs(Math.pow(10, 9)) || y2 >= Math.abs(Math.pow(10, 9)) || r2 >= Math.abs(Math.pow(10, 9))) {
            System.out.println("Limit error!");
        } else if (x1 == x2 && y1 == y2 && r1 == r2) {
            System.out.println("-1");
        } else if ((x1 == x2 && y1 == y2 && (r1 > r2 || r1 < r2)) || d + r1 < r2 || d + r2 < r1 || d > r1 + r2) {
            System.out.println("0");
        } else if (r2 == d + r1 || r1 == d + r2 || d == r1 + r2) {
            System.out.println("1");
        } else if (d + r1 > r2 || d + r2 > r1 || d < r1 + r2) {
            System.out.println("2");
        }
        sc.close();
//        long resultTime = System.currentTimeMillis() - startTime;
//        System.out.println("Time: " + resultTime);
    }
}
