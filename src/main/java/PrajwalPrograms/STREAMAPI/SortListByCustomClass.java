package PrajwalPrograms.STREAMAPI;

import java.util.*;
import java.util.stream.Collectors;

public class SortListByCustomClass {
//    Note:- Arrays.asList(): Creates a mutable list (you can modify elements), but the size is fixed (you can't add or remove items). Sorting works fine.
//          List.of(): Creates an immutable list (you can't modify, add, or remove items). Sorting throws an error.

    public static void main(String[] args) {

        List<Employee> data = Arrays.asList(
                new Employee(1, "john", 3200),
                new Employee(2, "pop", 5000),
                new Employee(3, "addy", 1000)
        );

        System.out.println(data);

//       // 1st way for sorting

        Collections.sort(data, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary()-o2.getSalary();
            }
        });
        System.out.println("sorted:-  "+ data);

        //2nd way using lambda expression //here descending of salary

        Collections.sort(data, (o1,o2)-> o2.getSalary()-o1.getSalary());
        System.out.println( "reverse:- "+ data);

        //3rd way for sorting by name

//        Collections.sort(data, Comparator.comparing(Employee::getName));
//         OR
//        Collections.sort(data, (x,y)-> x.getName().compareTo(y.getName()));
//        System.out.println("names sorting :-"+ data);

        //4th way
        //*******using stream api now
//        List<Employee> result = data.stream().sorted(Comparator.comparing(x -> x.getName())).toList();
//        System.out.println("stream:"+ result);

        //by method ref. for above  (Employee::getSalary)
        List<Employee> result = data.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println("Stream result for salary in reverse::--> " + result);

    }
}
