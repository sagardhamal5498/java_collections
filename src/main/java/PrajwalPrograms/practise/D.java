package PrajwalPrograms.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D {

    public static void main(String[] args) {

        String s="hello kingoo looi";
        String[] s2 = s.split(" ");

        List<StringBuilder> collect = Arrays.stream(s2).map(x -> new StringBuilder(x).reverse()).collect(Collectors.toList());
        System.out.println(collect);

        String kk = Arrays.stream(s.split(" ")).map(x -> new StringBuilder(x).reverse()).collect(Collectors.joining(" kk "));
        System.out.println(kk);

    }
}
