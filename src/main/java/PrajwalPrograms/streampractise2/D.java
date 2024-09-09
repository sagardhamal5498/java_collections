package PrajwalPrograms.streampractise2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class D {  // group by length of strings

    public static void main(String[] args) {

        String s="afj jullu bo all tujju po m";

        Map<Integer, List<String>> collect = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(x -> x.length(), Collectors.toList()));
        System.out.println(collect);
    }
}
