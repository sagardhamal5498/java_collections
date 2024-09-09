package PrajwalPrograms.streampractiseArray1;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class ImpZ { // Find the Top 3 Most Frequent Elements in an Array

    public static void main(String[] args) {

        int[] num = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5};
//
//        List<Map.Entry<Integer, Long>> collect = Arrays.stream(num).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
//                .entrySet().stream().sorted(Comparator.comparingLong(x -> x.getValue())).limit(3).collect(Collectors.toList());
//        System.out.println(collect);

//        I method :--

//        List<Map.Entry<Integer, Long>> collect = Arrays.stream(num)
//                .boxed()
//                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
//                .limit(3)
//                .collect(Collectors.toList());

//        II method :--

        List<Map.Entry<Integer, Long>> collect = Arrays.stream(num)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((entry1, entry2) -> Long.compare(entry2.getValue(), entry1.getValue())) // Lambda for reverse sorting
                .limit(3)
                .collect(Collectors.toList());

    }}

