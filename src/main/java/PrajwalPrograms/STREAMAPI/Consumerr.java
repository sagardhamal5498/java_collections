package PrajwalPrograms.STREAMAPI;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Consumerr {

    public static void main(String[] args) {  //consumer only takes input

        List<Integer> data = List.of(1, 2, 3, 1, 5);


//        Consumer<Integer> con= x-> System.out.println(("data printed :- "+ x));
//        con.accept(899);
//        data.stream().forEach(con);


//        OR
//        data.stream().forEach(x-> System.out.println("given data is :- " +x));

        //by method reference
//        data.stream().forEach(System.out::println);

    }
}
