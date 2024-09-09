package PrajwalPrograms.streampractise2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class F {  //


    public static void main(String[] args) {

        String str = "Replace the word 'word' with 'term' in this sentence";
        String target = "word";
        String replacement = "term";

        String collect = Arrays.stream(str.split(" ")).map(x -> x.replaceAll("word", "term")).collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
