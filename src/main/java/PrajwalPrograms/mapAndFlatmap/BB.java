package PrajwalPrograms.mapAndFlatmap;

import java.util.ArrayList;
import java.util.LinkedList;

public class BB {

    public static void main(String[] args) {
        LinkedList<Integer> dd = new LinkedList<>();
        dd.add(12);
        dd.add(34);
        dd.add(1);

        int i = dd.indexOf(34);
        System.out.println(i);

        dd.add(1,50);
        int i1 = dd.indexOf(34);
        System.out.println(i1);

    }
}
