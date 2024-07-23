package com.collections.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student(1, 44,"parkash"),
                new Student(4,55,"arpita"),
                new Student(2,22,"jhanvi"),
                new Student(3,67,"pokemon")

        );

        System.out.println(list);

        //compareTo method is used for logic behind sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
