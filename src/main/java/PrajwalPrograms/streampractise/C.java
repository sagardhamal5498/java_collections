package PrajwalPrograms.streampractise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C {  //Remove Duplicates and Sort Alphabetically

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date");

        List<String> collect = words.stream().sorted(Comparator.comparing(x -> x)).distinct().collect(Collectors.toList());
        System.out.println(collect);

//        List<String> t1 = words.stream().distinct().sorted(Comparator.comparing(x -> x)).collect(Collectors.toList());
//        System.out.println(t1);
//
//        List<String> t2 = words.stream().sorted(Comparator.comparing(x -> x)).distinct().collect(Collectors.toList());
//        System.out.println(t2);

    }
}
