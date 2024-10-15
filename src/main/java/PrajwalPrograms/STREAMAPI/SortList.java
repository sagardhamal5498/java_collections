package PrajwalPrograms.STREAMAPI;

import org.w3c.dom.CDATASection;

import java.util.*;

public class SortList {

    public static void main(String[] args) {


//        for sorting without using stream
//
        List<Integer> data=new ArrayList<>();
        data.add(23);
        data.add(11);
        data.add(31);
        Collections.sort(data);
        System.out.println(data);
        Collections.reverse(data);
        System.out.println(data);

        //only see this will also work --->
//        List<Integer> daat = Arrays.asList(1, 45, 3, 24);
//        Collections.sort(daat);
//        System.out.println(daat);

//         **for int using stream

//        List<Integer> data = List.of(1, 4, 2, 5, 7, 3);
//        List<Integer> list = data.stream().sorted().toList();
//        System.out.println(list);
//for reverse:-(2 methods)
//        List<Integer> list = data.stream().sorted(Comparator.reverseOrder()).toList();
//        List<Integer> list = data.stream().sorted(Comparator.comparingInt(x -> (int)x).reversed()).toList();
//        System.out.println(list);
//  note:-The cast (int) x is used because comparingInt works with the int type (a basic number). If you're dealing with Integer (an object), you need to convert it to int.
//        For simple sorting, this conversion isn't needed because Integer objects can be compared directly.


//       /** for string using stream
//
//        List<String> data = List.of("hom", "asfu", "gum");
//        List<String> list = data.stream().sorted().toList();
//        System.out.println(list);

    }
}
