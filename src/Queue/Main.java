package Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ///////////////////////////////////////////////////////////////////////
//        Queue<Integer> queue = new LinkedList<>();
//
//        int[] array = new int[]{1, 2, 0, 4, 3};
//
//        for (int elements : array) {
//            queue.add(elements);
//        }
//        System.out.println("Original queue: " + queue);
//        System.out.println("queue empty?: " + queue.isEmpty());
//        System.out.println("Remove element: " + queue.remove());
//        System.out.println("Actual queue: " + queue);
//
//        while (!queue.isEmpty()) {
//            queue.remove();
//        }
//
//        System.out.println(queue.peek());
        ////////////////////////////////////////////////////////////////////////
//
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//
//        Integer[] array = new Integer[]{4, 3, 1, 5, 2, 0};
//
//        //array[i] - элемент массива.
//        for (int i = 0; i < array.length; i++) {
//            priorityQueue.offer(array[i]);
//        }
//
//        System.out.println("Elements: " + priorityQueue);
//        ////////////////////////////////////////////////////////////////////////

        Comparator<Integer> comparator = (var1, var2) -> {
            if (var1 > var2) return -1;
            if (var1 < var2) return 1;
            return 0;
        };
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        Integer[] array = new Integer[]{4, 3, 1, 5, 2, 0};

        Collections.addAll(priorityQueue, array);
        System.out.println("Original priorityQueue: " + priorityQueue);

        priorityQueue.toArray(array);
        Arrays.sort(array, comparator);
        System.out.println("Sorted priorityQueue " + Arrays.toString(array));
    }
}
