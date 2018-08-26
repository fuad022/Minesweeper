package Interface;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[]{
                new Computer("Sony Vaio"),
                new Computer("Mac Pro"),
                new Computer("Mac Air")
        };

        for (Computer computer : computers) {
            computer.turnOn();
        }

        System.out.println("-- Are you sure to turn off your computers? (Y/N)");

        Scanner scanner = new Scanner(System.in);
        String cache = scanner.nextLine();

        if (Objects.equals(cache, "Y")) {
            System.out.println("-- Computers will be turn off");

            for (Computer computer : computers) {
                computer.turnOff();
            }
        } else if (Objects.equals(cache, "N")) {
            System.out.println("-- Computers will continue to work");
        } else {
            System.out.println("-- Unknows command");
        }
    }
}
