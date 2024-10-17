package PrajwalPrograms.streampractise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class A {

    public static void main(String[] args) {  //Find the Longest Word in a String

        String ss = "The quick brown gorgeous fox jumps over the lazy dog";

        String token = Arrays.stream(ss.split(" ")).max(Comparator.comparing(x -> x.length())).get();
        System.out.println(token);

    }
}
