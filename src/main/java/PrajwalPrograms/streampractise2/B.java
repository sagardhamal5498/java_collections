package PrajwalPrograms.streampractise2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class B {  //Sort Words in a String Alphabetically

    public static void main(String[] args) {

        String s="kin god tow abbe cocin mango";

        String collect = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(x -> x)).collect(Collectors.joining(" "));
        System.out.println(collect);

    }
}
