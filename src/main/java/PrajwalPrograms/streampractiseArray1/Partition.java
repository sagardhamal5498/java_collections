package PrajwalPrograms.streampractiseArray1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partition {  // Partition an Array into Two Lists less than 5 and greater than 5

    public static void main(String[] args) {

        int[] numbers = {3, 5, 7, 2, 8, 6};

        Map<Boolean, List<Integer>> collect = Arrays.stream(numbers).boxed().collect(Collectors.partitioningBy(x -> x > 5));

        System.out.println("greater than 5 :"+ collect.get(true));
        System.out.println("less than: " +collect.get(false));


    }
}
