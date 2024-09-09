package PrajwalPrograms.streampractiseArray3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BB {

    public static void main(String[] args) {

        int[][] aa = {{1, 2}, {3, 4}, {5, 6}};

        List<Integer> collect = Arrays.stream(aa).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList());
        System.out.println(collect);
    }
}
