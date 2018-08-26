package AbstractClass;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5, 6);
        square.getParameters();
        System.out.println("Area = " + square.getArea());
    }
}
