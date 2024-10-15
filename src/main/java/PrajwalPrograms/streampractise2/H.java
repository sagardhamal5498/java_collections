package PrajwalPrograms.streampractise2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class H { //

    public static void main(String[] args) {

       String text = "Th1s 1s a str1ng w1th num83rs";

//        List<List<Character>> collect = Arrays.stream(text.split(" ")).map(x -> x.chars().mapToObj(y -> (char) y).filter(y -> Character.isAlphabetic(y)).collect(Collectors.toList())).collect(Collectors.toList());
//        System.out.println(collect);

        String collect2 = text.chars().filter(x -> !Character.isDigit(x)).mapToObj(x -> String.valueOf((char) x)).collect(Collectors.joining(""));
        System.out.println(collect2);

//        Arrays.stream(text.split(" ")).map(x -> x.matches("[^0-9]")).collect(Collectors.toList());
    }
}
