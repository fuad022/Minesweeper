package Algorithms;

public class SingletonPrimer {
    //    private static volatile SingletonPrimer INSTANCE;
//
//    /**
//     * Double checked locking code on Singleton
//     *
//     * @return Singelton instance
//     */
//    public static SingletonPrimer getInstance() {
//        if (INSTANCE == null) {
//            synchronized (SingletonPrimer.class) {
//                if (INSTANCE == null) {
//                    INSTANCE = new SingletonPrimer();
//                }
//            }
//        }
//        return INSTANCE;
//    }
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton1.i = 5;
        System.out.println(singleton2.i);
    }
}

class Singleton {
    int i = 0;
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
