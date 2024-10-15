package PrajwalPrograms.comparableAndComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Impl {

    public static void main(String[] args) {

        List<Employee> data = Arrays.asList(

                new Employee(5, "pvk", 9000),
                new Employee(7, "akhila", 4000),
                new Employee(3, "wuur", 7000)
        );

//        Collections.sort(data);
//        System.out.println(data);

//        using comparator and sort by salary
        Collections.sort(data, new CompLogic());
        System.out.println(data);

         //sort by name
//        Collections.sort(data, new CompLogic2());
//        System.out.println(data);
    }
}
