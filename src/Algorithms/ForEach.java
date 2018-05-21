package Algorithms;


import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ForEach {

    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<String> names = Arrays.asList("John", "Jan", "Tirion", "Marry", "Nikolas");
//        List<String> names = Arrays.asList("John", "Daenerys", "Tyrion", "", null, "Arya");
        List<String> names = Arrays.asList("john", "arya", "sansa");

//        numbers.forEach(System.out::println);

//        numbers.stream()
//                .filter(i -> i % 2 == 0)
//                .forEach(System.out::println);

//        long count = names.stream()
//                .filter(i -> i.length() > 4)
//                .count();
//        System.out.println(count);

//        names.stream()
//                .filter(Objects::nonNull)
//                .filter(name -> !name.isEmpty() && name.contains("a"))
//                .forEach(System.out::println);

//        numbers.stream()
//                .map(i -> i * 2)
//                .forEach(System.out::println);

        names.stream()
                .map(StringUtils::capitalize)
                .forEach(System.out::println);

    }

}
