package com.collections.comparator;

import com.collections.comparator.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student(1, 44, "parkash"),
                new Student(4, 55, "arpita"),
                new Student(2, 22, "jhanvi"),
                new Student(3, 67, "pokemon")

        );

        System.out.println(list);

        //compare by id
        Collections.sort(list, new IdComparatorLogic());
        System.out.println(list);

        //compare by name
        System.out.println("-------------------------By NAME-------------------------------------");
        Collections.sort(list, new NameComparatorLogic());
        System.out.println(list);

        //compare by marks
        Collections.sort(list, new MarksComparatorLogic());
        System.out.println(list);
    }
}
