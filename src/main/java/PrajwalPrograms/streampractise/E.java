package PrajwalPrograms.streampractise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class E { //most frequent words in paragraph

    public static void main(String[] args) {

        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit .";

        Map.Entry<String, Long> result = Arrays.stream(paragraph.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream().max(Comparator.comparing(x -> x.getValue())).get();

        System.out.println(result);

    }
}
