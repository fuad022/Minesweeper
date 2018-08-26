package OOP;

public class RobotExt extends Robot {

    //Конструктор с параметрами
    public RobotExt(double x, double y) {
        //вызов конструктора родительского класса
        super(x, y);
    }

    public void back(int distance) {
        forward(-distance);
    }
}
