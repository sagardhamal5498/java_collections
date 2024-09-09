package PrajwalPrograms.streampractise4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A1 {

    public static void main(String[] args) {   //group by first letter/character

        List<String> data = List.of("apple", "banana", "avocado", "cherry", "apricot", "blueberry");

        Map<Character, List<String>> collect = data.stream().collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.toList()));
        System.out.println(collect);
    }
}
