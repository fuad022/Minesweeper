package Algorithms;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExpl {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        Deque<String> deque2 = new LinkedList<>();

        deque.add("one");
        deque.offer("two");
        deque.addLast("three");
        deque.offerLast("four");
        deque.addFirst("zero");
        deque.offerFirst("minus one");
        deque.push("minus two");

        String s1 = deque.removeLast();
        String s2 = deque.getLast();
        String s3 = deque.peekLast();
        String s4 = deque.pollLast();

        String s5 = deque.remove();
        String s6 = deque.removeFirst();
        String s7 = deque.pop();

        String s8 = deque.element();
        String s9 = deque.getFirst();
        String s10 = deque.peek();
        String s11 = deque.peekFirst();

        String s12 = deque.poll();
        String s13 = deque.pollFirst();

        System.out.println("////////////////////");
        System.out.println("s1 " + s1);
        System.out.println("s2 " + s2);
        System.out.println("s3 " + s3);
        System.out.println("s4 " + s4);

        System.out.println("\n" + "s5 " + s5);
        System.out.println("s6 " + s6);
        System.out.println("s7 " + s7);

        System.out.println("\n" + "s8 " + s8);
        System.out.println("s9 " + s9);
        System.out.println("s10 " + s10);
        System.out.println("s11 " + s11);

        System.out.println("\n" + "s12 " + s12);
        System.out.println("s13 " + s13);
        System.out.println("////////////////////");

//        for (String str : deque) {
//            System.out.println(str);
//        }

         deque.forEach(System.out::println);
    }
}
