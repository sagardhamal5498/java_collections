package PrajwalPrograms.streampractise3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class F {

    public static void main(String[] args) { //Find the Second Longest Word in a List

        List<String> data = List.of("apple", "banana", "avocado", "cherry", "watermelon");

        String s = data.stream().max(Comparator.comparingLong(x -> x.length())).get();
        System.out.println(s);

        String collect = data.stream().sorted(Comparator.comparingLong(x -> x.length())).skip(1).limit(1).collect(Collectors.joining());
        System.out.println(collect);

    }
}
