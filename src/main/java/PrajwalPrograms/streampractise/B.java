package PrajwalPrograms.streampractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B { //Count the Number of Words Starting with a Given Letter 'a'

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "avocado");

        long count = words.stream().filter(x -> x.startsWith("a")).count();
        System.out.println(count);
    }
}
