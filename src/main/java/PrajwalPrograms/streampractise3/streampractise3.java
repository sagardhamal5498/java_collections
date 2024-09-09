package PrajwalPrograms.streampractise3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class streampractise3 {

    public static void main(String[] args) {

        //Given a list of strings, use the Stream API to find the longest palindromic substring across all strings.

        List<String> data = List.of( "level","racecar", "rotor", "hello","kukukukuk");

        List<String> collect = data.stream().filter(x -> x.equals(new StringBuilder(x).reverse().toString())).collect(Collectors.toList());
        System.out.println(collect);

        String result = data.stream().filter(x -> x.equals(new StringBuilder(x).reverse().toString())).max(Comparator.comparingLong(x -> x.length())).get();
        System.out.println(result);

    }
}
