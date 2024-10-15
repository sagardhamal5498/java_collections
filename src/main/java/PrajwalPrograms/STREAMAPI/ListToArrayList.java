package PrajwalPrograms.STREAMAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayList {

    public static void main(String[] args) {

        List<Integer> daat = Arrays.asList(1, 45, 3, 24);

        for(int i1:daat){
            System.out.println(i1);
        }

        ArrayList<Integer> ay = new ArrayList<>(daat);
        ay.remove(2);
        System.out.println(ay);

        Integer[] arr = ay.toArray(new Integer[0]);
        System.out.println(arr[1]);
    }
}
