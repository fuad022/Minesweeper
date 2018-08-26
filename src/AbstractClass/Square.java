package AbstractClass;

public class Square extends Figure {

    private double width;
    private double heigth;

    public Square(double width, double height) {
        super(width, height);
        this.width = width;
        this.heigth = height;
    }

    @Override
    public double getArea() {
        return width * heigth;
    }
}
