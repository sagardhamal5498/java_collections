package PrajwalPrograms.STREAM_CHEATSHEET;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamImplPractise {

    public static void main(String[] args) {

        List<Employee> emplist = EmpImpl.getAllemp();

        //for each
//        emplist.stream().forEach(x-> System.out.println(x));
//        emplist.stream().forEach(System.out::println);

        //* filter  :-  emp from "development" and salary greater than 85k

//        List<Employee> development = emplist.stream().filter(x -> x.getDept().equals("Development") && x.getSalary()>85000).toList();
//        System.out.println(development );

        //above condition and return only name and salary
//        Map<String, Double> ss = emplist.stream().filter(x -> x.getDept().equals("Development") && x.getSalary() > 85000).collect(Collectors.toMap(Employee::getName, Employee::getSalary));
//        System.out.println(ss);

        //* map  :- to get list of dept
//        List<String> res = emplist.stream().map(Employee::getDept).distinct().toList();
//        System.out.println(res);

        //OR

//        Set<String> res2 = emplist.stream().map(Employee::getDept).collect(Collectors.toSet());
//        System.out.println(res2);

        //** for getting nested class(project) objects fields i.e. if you want project class names then do some operations

//        List<List<String>> reslist = emplist.stream().map(x -> x.getProjects().stream().map(y -> y.getName()).toList()).distinct().toList();  //wrong one
//        System.out.println(reslist);

//        Set<String> result = emplist.stream().flatMap(x -> x.getProjects().stream())   //flatmap is best if you want to fetch data from nested objects
//                .map(x -> x.getName()).collect(Collectors.toSet());
//        System.out.println(result);

        //* sorting  :- by salary ascending and descending
//        List<Employee> ascres = emplist.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
//        System.out.println(ascres);

//        List<Employee> ascres = emplist.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).toList();
//        System.out.println(ascres);

         //OR

//        List<Employee> descres = emplist.stream().sorted(Collections.reverseOrder(Comparator.comparing(x->x.getSalary()))).toList();
//        System.out.println(descres);

    }
}
