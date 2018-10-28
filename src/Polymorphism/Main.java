package Polymorphism;

public class Main {

    void useCar(Car car) {
        car.driving();
        System.out.println(car.getNumOfSeets());
    }

    public static void main(String[] args) {
//        Hogwarts[] hogwarts = new Hogwarts[] {
//                new Gryffindor(),
//                new Hufflepuff(),
//                new Ravenclaw(),
//                new Slytherin()
//        };
//
//        for (Hogwarts institution : hogwarts) {
//            institution.getFaculty();
//        }

        Main main = new Main();
        Car car = new Toyota();
        main.useCar(car);
    }
}
