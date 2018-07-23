package Algorithms;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExpl {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("one");
        queue.offer("two");
        System.out.println(queue);

        for (String str : queue) {
            System.out.println("Final: " + str);
        }

//        String s = queue.remove();
//        String s = queue.poll();
        String s = queue.peek();
//        System.out.println("\n" + "Removed: " + s);
        System.out.println("\n" + "After peek: " + s);

        for (String str : queue) {
            System.out.println("After update: " + str);
        }
    }
}
