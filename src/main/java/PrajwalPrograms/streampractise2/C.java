package PrajwalPrograms.streampractise2;

import java.util.Map;
import java.util.stream.Collectors;

public class C { //Count the Frequency of Each Character in a String

    public static void main(String[] args) {

        String s="kinnnu mango";

        Map<Character, Long> collect = s.chars().mapToObj(x -> (char) x).filter(x->!x.equals(' ')).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect);



    }
}
