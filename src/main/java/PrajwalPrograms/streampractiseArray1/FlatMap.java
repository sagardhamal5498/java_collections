package PrajwalPrograms.streampractiseArray1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {

        int[][] data = {{1, 2, 3}, {4, 5}, {6, 7, 8}};


        List<Integer> list = Arrays.stream(data).flatMap(x -> Arrays.stream(x).boxed()).toList();
        System.out.println(list);


//        List<Integer> collect = Arrays.stream(data).flatMapToInt(x -> Arrays.stream(x)).boxed().collect(Collectors.toList());
//        System.out.println(collect);
    }
}
