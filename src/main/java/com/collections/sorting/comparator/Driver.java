package com.collections.sorting.comparator;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        List<com.collections.sorting.comparator.Employee> list = Arrays.asList(
                new com.collections.sorting.comparator.Employee(12, "Ram", 45),
                new com.collections.sorting.comparator.Employee(1, "Radha", 21),
                new com.collections.sorting.comparator.Employee(45, "Krishna", 49),
                new Employee(78, "Buddhan", 32)
        );
        Collections.sort(list,new IdComparator());
        System.out.println(list);
        Collections.sort(list,new AgeComparator());
        System.out.println(list);
        Collections.sort(list,new NameComparator());
        System.out.println(list);

    }



}
