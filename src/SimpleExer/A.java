package SimpleExer;

class A {
    public static void test1() {
        System.out.println("A.test1");
    }

    static void test2() {
        test1();
    }
}
