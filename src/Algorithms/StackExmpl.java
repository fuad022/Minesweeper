package Algorithms;

import java.util.Stack;

public class StackExmpl {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("one");
        stack.push("two");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        stack.forEach(System.out::println);
    }
}
