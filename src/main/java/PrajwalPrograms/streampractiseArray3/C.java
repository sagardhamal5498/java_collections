package PrajwalPrograms.streampractiseArray3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C {  //find even number from 1 to 10 and sum them

    public static void main(String[] args) {
        //        IntStream range = IntStream.range(1, 11);
//
//        //2 4 6 8
//        int sum = range.filter(x -> x % 2 == 0).sum();
//        System.out.println(sum);

        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = data.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
        System.out.println(sum);

//        IntStream range = IntStream.range(1, 5);
//        Stream<Integer> integerStream = range.mapToObj(x -> Integer.valueOf(x));
//        Stream<Integer> integerStream1 = range.mapToObj(Integer::valueOf);
    }
}
