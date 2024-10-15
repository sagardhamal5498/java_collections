package PrajwalPrograms.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class PP {

        public static void main(String[] args) {
            List<List<Integer>> data = List.of(
                    List.of(1, 2, 3),
                    List.of(4, 5),
                    List.of(6, 7, 8)
            );

//            List<Integer> flatList = listOfLists.stream()
//                    .flatMap(List::stream)  // Flatten the lists
//                    .collect(Collectors.toList());
//
//            System.out.println(flatList);

//            List<Integer> collect = data.stream().flatMap(List::stream).collect(Collectors.toList());
//            System.out.println(collect);

//            List<Integer> list = data.stream().flatMap(x -> x.stream()).toList();
//            System.out.println(list);


//            double multi[][] = { {1.0, 2.0}, {2.11, 204.00, 11.00, 34.00},{66.5,43.3,189.6}};
//
//            Arrays.stream(multi).flatMapToDouble(x->DoubleStream.of(x)).forEach(x-> System.out.println(x));
//            System.out.println(array);

        }
    }


