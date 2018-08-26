package InnerClass;

public class Main {
    public static void main(String[] args) {
        Wristwatch wristwatch1 = new Wristwatch("Apple Watch");
        wristwatch1.setCountry("USA");
        wristwatch1.setModel("Series 1\n");

        Wristwatch wristwatch2 = new Wristwatch("Apple Watch");
        wristwatch2.setCountry("USA");
        wristwatch2.setModel("Nike+\n");

        Wristwatch wristwatch3 = new Wristwatch("Tissot");
        wristwatch3.setCountry("Switzerland");
        wristwatch3.setModel("T50\n");
    }
}
