package PrajwalPrograms.streampractise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class H {  //Convert a List of Strings to a List of Their Lengths

    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "stream", "api","parafa","fdaf","fdafjlf","etewrewp","ariae","jsa");

//        List<Integer> list = words.stream().map(x -> x.length()).collect(Collectors.toList());
//
//        System.out.println(list);

        List<String> collect = words.stream().map(x -> x + " = " + x.length()).collect(Collectors.toList());
        System.out.println(collect);
//
//        List<String> list1 = words.parallelStream().map(x -> x).toList();
//        System.out.println(list1);

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Sequential stream
//        numbers.stream()
//                .map(n -> n * 2)
//                .forEach((x)->
//                        System.out.print(x+" ")
//                );
//
//        System.out.println();

// Parallel stream
//        numbers.parallelStream()
//                .map(n -> n * 2)
//                .forEach((x)->
//                        System.out.print(x+" ")
//                );



    }
}
