package RegEx1;
////////////////////////////simple exmpl////////////////////////////////
//class A {
//    private static int counter = 0;
//
//    public static int getInstanceCount() {
//        return counter;
//    }
//
//    public A() {
//        counter++;
//    }
//}
////////////////////////////////////////////////////////////////////////

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ////////////////////////////////////////////////
//        A a1 = new A();
//        A a2 = new A();
//        A a3 = new A();
//        System.out.println(A.getInstanceCount());
        ////////////////////////////////////////////////

//        int[] a = {5, 5};
//        int b = 1;
//        a[b] = b = 0;
//        System.out.println(Arrays.toString(a));

        /////////////////////////////////////////////////

        int x = 1, y = 2, z = 3;
        z = sen(x, y, z);
        System.out.println(x + ":" + y + ":" + z + ":");
        x = sen(z, z, x);
        System.out.println(x + ":" + y + ":" + z + ":");
        y = sen(y, y, z);
        System.out.println(x + ":" + y + ":" + z + ":");
    }

    private static int sen(int z, int x, int y) {
        z--;
        x = 2 * y + z;
        y = x - 1;
        System.out.println(y + ":" + z);
        return x;
    }
}
