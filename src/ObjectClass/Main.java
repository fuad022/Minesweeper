package ObjectClass;

public class Main {
    public static void main(String[] args) {
//        Sample sample = new Sample();
//        System.out.println(sample.getClass());

        Sample sample1 = new Sample("text");
        Sample sample2 = new Sample("text");
        System.out.println(sample1.hashCode() + " " + sample2.hashCode());
        System.out.println(sample1.equals(sample2));
//        System.out.println(sample1.toString());
    }
}
