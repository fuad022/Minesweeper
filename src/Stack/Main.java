package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Stack " + stack);
        System.out.println("Pop " + stack.pop());
        System.out.println("After pop " + stack);
        System.out.println("Pop " + stack.pop());
        System.out.println("After pop " + stack);
        System.out.println("Pop " + stack.pop());
        System.out.println("After pop " + stack);
    }
}
