package PrajwalPrograms.streampractise3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E {  //

    public static void main(String[] args) {
        List<String> data = List.of("hello world", "world of java", "hello again");

        String collect = data.stream().collect(Collectors.joining(" "));
        System.out.println(collect);

        String collect1 = Arrays.stream(collect.split(" ")).distinct().collect(Collectors.joining(" "));
        System.out.println(collect1);
    }
}
