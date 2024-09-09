package PrajwalPrograms.streampractise4;

import java.util.*;
import java.util.stream.Collectors;

public class ImpC {  // Find Words Containing Only Unique Characters

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date", "fig", "grape");

//        List<String> collect = words.stream().filter(x -> {
//            Set<Character> ss = x.chars().mapToObj(y -> (char) y).collect(Collectors.toSet());
//            return ss.size() == x.length();
//        }).collect(Collectors.toList());
//        System.out.println(collect);



//        //chutiya method :--> Dont try
//        List<List<Character>> collect = words.stream().map(y -> y.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet()
//                .stream().filter(x -> x.getValue() == 1).map(x -> x.getKey()).collect(Collectors.toList())).collect(Collectors.toList());
//        System.out.println(collect);

    }
}
