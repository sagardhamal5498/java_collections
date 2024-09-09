package PrajwalPrograms.streampractise;

import PrajwalPrograms.streampractiseArray3.Practise;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class practise {

    boolean test(int x){
        if(x%2==0){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        practise pp=new practise();

        List<Integer> numbers = IntStream.rangeClosed(1, 9)
                .boxed()
                .collect(Collectors.toList());

        int sumOfEvenNumbers = numbers.stream()
                .filter(x->pp.test(x))
                .mapToInt(Integer::intValue)
                .sum();

        // Print the result
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);

    }
}
