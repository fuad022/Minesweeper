package Algorithms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
//        List<String> arrayList = new ArrayList<>();
//        LinkedList<String> linkedList = new LinkedList<>();
//
        String habr = "habrahabr";
        int length = habr.length();
        char searchChar = 'a';
        boolean isFound = false;

        for (int i = 0; i < length; ++i) {
            if (habr.charAt(i) == searchChar) {
                isFound = true;
                break;
            }
        }
        System.out.println(message(isFound));
        System.out.println(message(habr.indexOf(searchChar) != -1));

//        try {
//            test(new StringBuffer(""));
//            test(new StringBuilder(""));
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }

    }

//    private static void test(Appendable obj) throws IOException {
//
//        long before = System.currentTimeMillis();
//        for (int i = 0; i ++ < 1e9;) {
//            obj.append("");
//        }
//        long after = System.currentTimeMillis();
//        System.out.println(obj.getClass().getSimpleName() + ": " + (after - before) + "ms.");
//
//    }

    private static String message(boolean b) {
        return "Your char had" + (b ? " " : "n't ") + "been found!";
    }
}
