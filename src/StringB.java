public class StringB {
    public static void main(String[] args) {
        StringBuffer buffer1 = new StringBuffer("This is ");
        buffer1.append("StringBuffer");
        System.out.println(buffer1);

        StringBuffer buffer2 = new StringBuffer("StringBuffer error cool thing");
        buffer2.delete(12, 18);
        System.out.println(buffer2);

        StringBuffer buffer3 = new StringBuffer("StringBuffer ");
        buffer3.insert(13, "like a StringBuilder");
        System.out.println(buffer3);

        StringBuffer buffer4 = new StringBuffer("StringBuffer");
        buffer4.replace(0, 12, "StringBuilder");
        System.out.println(buffer4);

        StringBuffer buffer5 = new StringBuffer("StringBuilder");
        buffer5.reverse();
        System.out.println(buffer5);
    }
}
