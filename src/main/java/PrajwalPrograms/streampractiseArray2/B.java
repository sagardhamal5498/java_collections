package PrajwalPrograms.streampractiseArray2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class B {  //Partition an Array of Strings Into Two Lists: Palindromes and Non-Palindromes

    public static void main(String[] args) {

        String[] words = {"madam", "apple", "racecar", "banana", "level"};

        Map<Boolean, List<String>> collect = Arrays.stream(words).collect(Collectors.partitioningBy(x -> x.equals(new StringBuilder(x).reverse().toString())));

        System.out.println("pallindromes are:-"+collect.get(true));
        System.out.println("not pallindromes:-"+collect.get(false));
    }
}
