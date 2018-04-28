package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Digit {

    public static void main(String[] args) {

//      String str = "dsd3 dsss 456";
//////
//        StringBuilder strBuilder = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if(Character.isDigit(ch))
//                strBuilder.append(ch);
//        }
//        System.out.println(Integer.parseInt(strBuilder.toString()));
//
//        ArrayList<Integer> lst = new ArrayList<Integer>();
//        for (String field : str.split(" +")) {
//            lst.add(Integer.parseInt(field));
//            System.out.println(lst.add(Integer.parseInt(field)));
//        }
//        Pattern pattern = Pattern.compile(" ");
//        String[] animals = pattern.split(str);
//        Arrays.asList(animals).forEach(animal -> System.out.print(animal));
 ///////////////////////////////////////////////////////////////////////////////////////////////
//        String test = "0, 1, 3, 2, 2, 1, 1, 4, 2, 5, 1, 1, 0, 1, 241";
//        String str = "dsd3 dsss 456";
//
////        String[] testArray = test.split(", ");
////        String[] testArray = test.replaceAll(", ", "-").split("-");
//        String[] testArray = str.replaceAll("^\\D+","").split("\\D+");
//
////        int max = Integer.MIN_VALUE, maxIndex = 0;
//        int minInt = Integer.MAX_VALUE;
//
//        for (String aTestArray : testArray) {
//            if (Integer.parseInt(aTestArray) < minInt) {
//                minInt = Integer.parseInt(aTestArray);
////                maxIndex = i;
//            }
//        }
//        System.out.println(minInt);
 ////////////////////////////////////////////////////////////////////////////////////////////////
//        String str = "dsd3 dsss 456";
//
//        int max = Character.getNumericValue(str.charAt(0));
//        for (int i = 1; i < str.length(); i++) {
//            int compare = Character.getNumericValue(str.charAt(i));
//            if (max < compare) {
//                max = compare;
//            }
//        }
//        System.out.println(max);
///////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

//        String str = "dsd38 dsss 456";
////        String str = "";
//
//        String[] testArray = str.replaceAll("^\\D+","").split("\\D+");
//
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        if (str.matches(".*\\D+.*")) {
//            for (String aTestArray : testArray) {
//                if (Integer.parseInt(aTestArray) < min) {
//                    min = Integer.parseInt(aTestArray);
//                }
//                if (Integer.parseInt(aTestArray) > max) {
//                    max = Integer.parseInt(aTestArray);
//                }
//            }
//
//            System.out.println("min num: " + min);
//            System.out.println("max num: " + max);
//            return;
//
//        }
//        System.out.println("No digit!");
 /////////////////////////////////////////////////////////////////////////////////////////////////////////
//
////        String str = "dsd38 dsss 456";
//        String str = " ";
//
//        String[] testArray = str.replaceAll("^\\D+","").split("\\D+");
//
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        try {
//            for (String aTestArray : testArray) {
//                if (Integer.parseInt(aTestArray) < min) {
//                    min = Integer.parseInt(aTestArray);
//                }
//                if (Integer.parseInt(aTestArray) > max) {
//                    max = Integer.parseInt(aTestArray);
//                }
//            }
//
//            System.out.println("min num: " + min);
//            System.out.println("max num: " + max);
//
//        } catch (NumberFormatException e) {
////            e.printStackTrace();
//            System.out.println("No digit!");
//
////            return new ResponseEntity<>("Empty vacancy", HttpStatus.FORBIDDEN);
//        }

 //////////////////////////////////////////////////////////////////////////////////////////////////////////

//        @Test
//        public void test(){
            String str = "100 200 azn";
//        String str = "-";
            String[] testArray = str.replaceAll("^\\D+","").split("\\D+");

            System.out.println(Arrays.toString(testArray));

            int minInt = 0;
            int max = 0;

            if (testArray.length >= 2) {

                minInt = Integer.MAX_VALUE;
                max = Integer.MIN_VALUE;

                for (String aTestArray : testArray) {
                    if (Integer.parseInt(aTestArray) < minInt) {
                        minInt = Integer.parseInt(aTestArray);

                    }
                    if (Integer.parseInt(aTestArray) > max) {
                        max = Integer.parseInt(aTestArray);

                    }
                }
//                Assert.assertTrue(max>minInt);
            } else if (testArray.length == 1) {
                minInt = max = Integer.parseInt(testArray[0]);
            }

            System.out.println(minInt + " <= " + max);
//            Assert.assertTrue(max>=minInt);

//        }

    }
}
