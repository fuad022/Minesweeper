package Algorithms;

class Factorial {

    int fact(int n) {
//        int result;
        if (n == 1) {
            return 1;
        }
//        int result = fact(n - 1) * n;
//        return result;
        return fact(n - 1) * n;
    }
}

class Recurtion {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        System.out.println("1! = " + factorial.fact(3));
//        System.out.println("2! = " + factorial.fact(1));
//        System.out.println("3! = " + factorial.fact(4));
    }
}
