package PrajwalPrograms.streampractise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DImp {
    // Find the First Non-Repeated Character in a String

    public static void main(String[] args) {

        String input="kalkapolk";

        Character key = input.chars().mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
        System.out.println(key);


        //2nd way:-

        //        Character result = input.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() == 1)
//                .map(Map.Entry::getKey)
//                .findFirst()
//                .orElse(null);
//
//        System.out.println("First non-repeated character: " + result);

//        3rd way
//
//        Character res = input.chars().mapToObj(x -> (char) x)
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet().stream().filter(x -> x.getValue() == 1).findFirst().map(x -> x.getKey()).get();
//        System.out.println(res);

    }

    }
//Explanation:--
//        Function.identity():       ***
//        This is the classifier function, meaning it tells the groupingBy method what to use as the "key" for grouping. Function.identity() simply returns the character itself, so each character in the stream becomes the key in the resulting map.
//        For example, if the string is "swiss", the keys in the map will be: 's', 'w', and 'i'.
//
//       LinkedHashMap::new:         ***
//        By default, groupingBy() uses a HashMap, which doesn't preserve the insertion order.
//        Here, we use LinkedHashMap::new to ensure that the order of characters in the map matches the order in which they appear in the string. This is important because we want the first non-repeated character, and preserving the order ensures we check characters in the correct sequence.
//        For example, if the string is "swiss", the map will maintain the order: {'s', 'w', 'i'}

