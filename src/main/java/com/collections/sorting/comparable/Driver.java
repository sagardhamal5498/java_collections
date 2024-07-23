package com.collections.sorting.comparable;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

         List<Employee> list = Arrays.asList(
                new Employee(12, "Ram", 45),
                new Employee(1, "Radha", 21),
                new Employee(45, "Krishna", 49),
                new Employee(78, "Buddhan", 32)
        );
        Collections.sort(list);
        System.out.println(list);
    }
}
