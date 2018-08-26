package Inheritance;

import java.util.Objects;

public class Main {

    private static void getResult(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        Nokia phone = new Nokia();
        phone.model = "Nokia 3310";

        if (Objects.equals(phone.getModel(), "Nokia 3310")) {
            getResult(phone.getErrorMessage());
        } else {
            getResult(phone.getSuccesMessage());
        }
    }
}
