package com.collections.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, 1, 6, 0, 3, 4};
        int missingNumber = IntStream.rangeClosed(0, arr.length).sum() - IntStream.of(arr).sum();

        System.out.println(missingNumber);


//        List<Student> list = Arrays.asList(
//                new Student(1, 44,"parkash"),
//                new Student(4,55,"arpita"),
//                new Student(2,22,"jhanvi"),
//                new Student(3,67,"pokemon")
//
//        );
//
//        System.out.println(list);
//
//        //compareTo method is used for logic behind sorting
//        Collections.sort(list);
//        System.out.println(list);
    }
}
