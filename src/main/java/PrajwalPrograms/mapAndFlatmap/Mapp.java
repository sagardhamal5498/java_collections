package PrajwalPrograms.mapAndFlatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mapp {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "comp", Arrays.asList(123, 456)),
                new Employee(2, "electrical", Arrays.asList(999, 125)),
                new Employee(3, "mechanical", Arrays.asList(858, 121))
        );

        System.out.println(list);

        List<String> result1 = list.stream().map(x -> x.getDept()).toList();
        System.out.println(result1);

        List<List<Integer>> result2 = list.stream().map(x -> x.getPhone()).toList();
        System.out.println(result2);

//        List<Integer> result3 = list.stream().map(Employee::getId).toList();
//        System.out.println(result3);

        //flatmap --> will flatten only stream of stream of data like this (list inside list)
        //            for one to many data //map is for one to one mapping only
        List<Integer> resulttt = list.stream().flatMap(x -> x.getPhone().stream()).toList();
        System.out.println(resulttt);

    }
}
