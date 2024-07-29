package com.collections.practise;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ListPractice {

    public static void main(String[] args) {

//        List list=new ArrayList();

        List list=new Vector<>();


        list.add(34);
        list.add(12);
        list.add(44);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Comparable max = Collections.max(list);
        System.out.println(max);

//        Integer min = Collections.min(list);
//        System.out.println(min);

        Collections.reverse(list);
        System.out.println(list);

        int i = Collections.binarySearch(list, 355);
        System.out.println(i);

        int i1 = list.indexOf(44);
        System.out.println(i1);

    }
}
