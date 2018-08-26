package InnerClass;

public class Wristwatch {

    String title;

    public Wristwatch(String title) {
        this.title = title;
    }

    public void setCountry(String name) {
        class Country {
            void display() {
                System.out.println("Country: " + name);
            }
        }

        Country country = new Country();
        country.display();
    }

    public void setModel(String name) {
        class Model {
            void display() {
                System.out.println("Model: " + name);
            }
        }

        Model model = new Model();
        model.display();
    }
}
