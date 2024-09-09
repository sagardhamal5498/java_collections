package PrajwalPrograms.flatmap;

import java.util.List;
import java.util.stream.Collectors;

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

            List<Integer> collect = data.stream().flatMap(List::stream).collect(Collectors.toList());
            System.out.println(collect);
        }
    }


