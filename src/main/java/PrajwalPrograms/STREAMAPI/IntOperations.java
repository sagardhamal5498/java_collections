package PrajwalPrograms.STREAMAPI;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntOperations {

    public static void main(String[] args) {

        List<Integer> ll = Arrays.asList(2, 1, 3, 5, 88, 34);

        Optional<Integer> max = ll.stream().max(Comparator.comparingInt(x -> x));
        System.out.println(max);
        System.out.println(max.get());

        int a[]={23,11,45,21};

        //   1) for max ?
//        OptionalInt max = Arrays.stream(a).max();     //min , average (OptionalDouble),
//        System.out.println(max);
//        int maxx = Arrays.stream(a).max().getAsInt();
//        System.out.println(maxx);


        //  2) for sorting ?  dekhlo achese
//        IntStream s = Arrays.stream(a).sorted();
//        Stream<Integer> ss = Arrays.stream(a).boxed().sorted();
//
//        int[] array = s.toArray();
//        Object[] array1 = ss.toArray();
        //OR
//        List<Integer> list = ss.toList();

//        3) for sum ?         //Note:- int primitive is compulsory
//        int sum = Arrays.stream(a).sum();
//        System.out.println(sum);

        // 4) int arrays to list
//        List<Integer> list = Arrays.stream(a).boxed().toList();   //boxed => primitive to wrapper // for unbox => mapToInt(Integer::getValue)
//        System.out.println(list);

        // 5) unbox from Integer object to int
//        List<Integer> data = Arrays.asList(1, 24, 12);
//        int maxx = data.stream().mapToInt(Integer::intValue).max().getAsInt();  // OR use -> mapToInt(x -> x)
//        System.out.println(maxx);

    }
}
