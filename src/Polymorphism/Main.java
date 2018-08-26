package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = new Hogwarts[] {
                new Gryffindor(),
                new Hufflepuff(),
                new Ravenclaw(),
                new Slytherin()
        };

        for (Hogwarts institution : hogwarts) {
            institution.getFaculty();
        }
    }
}
