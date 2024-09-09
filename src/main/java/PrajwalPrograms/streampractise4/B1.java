package PrajwalPrograms.streampractise4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class B1 {  //first non-repeating character

    public static void main(String[] args) {

        String input = "swiss";

        List<Map.Entry<Character, Long>> collect = input.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).limit(1).collect(Collectors.toList());
        System.out.println(collect);

//        Map.Entry<Character, Long> cc = input.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, Collectors.counting()))
//                .entrySet().stream().filter(x -> x.getValue() == 1).limit(1).findFirst().get();
//        System.out.println(cc);
    }
}
