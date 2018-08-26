package SetCollection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        SortedSet<Integer> numberSet = new TreeSet<>();
//        NavigableSet<Integer> navigableSet = new TreeSet<>();
//        TreeSet<Integer> treeSet = new TreeSet<>();
//        Set<Integer> linkedHashSet = new LinkedHashSet<>();


        int[] array = new int[]{6, 8, 54, 12, 33, 9, 23, 1, 82, 10};
//        int[] array = {6, 8, 54, 12, 33, 9, 23, 1, 82, 10};
        Set<Integer> hashSet = new HashSet<>();

        ///////////////////////////////////////////////////////////////////////////////////////
//        for (int i = 0; i < array.length; i++) {
//            numberSet.add(i);
//        }
////        for (int simpleArray : array) {
////            numberSet.add(simpleArray);
////        }
//
//        System.out.println(numberSet);
//        System.out.println("First element " + numberSet.first());
//        System.out.println("Last element " + numberSet.last() + "\n");
//
////        SortedSet<Integer> subset = numberSet.subSet(0, 4);
////
////        System.out.println("Subset from 0 to 3: " + subset + "\n");
////        System.out.println("1st element of subset " + subset.first());
////        System.out.println("Last element of subset " + subset.last() + "\n");
        ///////////////////////////////////////////////////////////////////////////////////////

//        for (int navigableArrey : array) {
//            navigableSet.add(navigableArrey);
//        }
//
//        System.out.println("lower: " + navigableSet.lower(33));
//        System.out.println("higher: " + navigableSet.higher(33));
//        System.out.println("floor: " + navigableSet.floor(12));
//        System.out.println("ceiling: " + navigableSet.ceiling(33));
////        System.out.println("poolFirst: " + navigableSet.pollFirst());
////        System.out.println("poolLast: " + navigableSet.pollLast());
//
////        Iterator iterator = navigableSet.descendingIterator();
//        Iterator iterator = navigableSet.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next() + " ");
//        }
        ////////////////////////////////////////////////////////////////////////////////////////

//        for (int i = 0; i < array.length; i++) {
//            treeSet.add(array[i]);
//        }
//
//        System.out.println("Size of current TreeSet: " + treeSet.size());
//        System.out.println("Size of current TreeSet: " + treeSet.toString());
////        System.out.println("array length: " + array.length);
//
//        for (int i = 0; i < array.length / 2; i++) {
//            treeSet.remove(array[i]);
//        }
//
//        System.out.println("TreeSet after removing: " + treeSet.toString());
//        /////////////////////////////////////////////////////////////////////////////////////////

//        for (int i = 0; i < array.length; i++) {
//            linkedHashSet.add(array[i]);
//        }
//
//        Iterator iterator = linkedHashSet.iterator();
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(iterator.next());
//        }
        ///////////////////////////////////////////////////////////////////////////////////////////

        for (int i = 0; i < array.length; i++) {
            hashSet.add(array[i]);
        }
//        for (int hs : array) {
//            hashSet.add(hs);
//        }
        System.out.println(hashSet.toString());
    }
}
