package Primer;

class Primer {
    int a;

    Primer(int i) {
        a = i;
    }
}

class Main {
    private static void swap(Primer a1, Primer a2) {
        int t;
        t = a1.a;
        a1.a = a2.a;
        a2.a = t;
    }

    public static void main(String[] args) {
        Primer primer1 = new Primer(5);
        Primer primer2 = new Primer(9);
        swap(primer1, primer2);
        System.out.println("primer1 = " + primer1.a);
        System.out.println("primer2 = " + primer2.a);
    }
}