package PrajwalPrograms.streampractise3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class D { //Check if Any String Contains All Vowels

    public static void main(String[] args) {

        List<String> data = List.of("education", "hello", "world");

        List<String> collect = data.stream()
                .filter(x -> x.contains("e") && x.contains("o") && x.contains("a") && x.contains("i") && x.contains("u"))
                .collect(Collectors.toList());
        System.out.println(collect);

//        data.stream().map(x->x.chars().mapToObj(y->(char)y).fil);

    }
}
