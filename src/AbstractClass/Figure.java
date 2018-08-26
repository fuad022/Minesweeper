package AbstractClass;

public abstract class Figure {
    private double width;
    private double height;

    public Figure(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void getParameters() {
        System.out.println("Params of square: width: " + width + "; height: " + height);
    }

    public abstract double getArea();
}
