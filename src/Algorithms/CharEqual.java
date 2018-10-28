package Algorithms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharEqual {
    public static void main(String[] args) {
        char[] arrChar = {'a', 'b', 'c', 'd', 'a', 'b', 'e', 'f', 'a', 'b'};
        List<char[]> arrayList = Arrays.asList(arrChar);
        System.out.println(charCount(arrayList));
    }

    private static int charCount(List<char[]> chars) {
        int count = 0;
        char[] aChar = {'a'};

//        for (int i = 0; i < chars.length -1; i++) {
//            if ((chars[i] + chars[i + 1])  "ab") {
//                count++;
//            }
//        }

//        for (char ch : chars) {
//            if (ch == 'a') {
//                count++;
//            }
//        }

        return count;
    }
}
