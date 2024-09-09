package PrajwalPrograms.streampractise4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class E { // Group Words by Their Length and Find the Longest Word in Each Group

    public static void main(String[] args) {

        List<String> words = List.of("apple", "banana", "fig", "grape", "date", "cherry");

        Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(x -> x.length(), Collectors.toList()));
        System.out.println(collect);

    }
}
