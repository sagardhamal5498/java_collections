package com.collections;

import java.util.*;

public class A {
    public static void main(String[] args) {


         ArrayList<Integer> list = new ArrayList<>();
        list.add(545);
        list.add(545454);
         Integer max = Collections.max(list);
         System.out.println(max);


         LinkedList<Integer> linkedList = new LinkedList<>();

         linkedList.add(78);
         linkedList.add(98);
         Integer max1 = Collections.max(linkedList);
        System.out.println(max1);

         List<Integer> vector = new Vector<>();
         vector.add(545);
         vector.add(788);
         Integer max2 = Collections.max(vector);
        System.out.println(max2);


        final LinkedHashSet<Integer> ss = new LinkedHashSet<>();
        ss.add(78);
        ss.add(97);
        System.out.println(ss);


         Set objects = new HashSet<>();
         objects.add(78);
        objects.add(98);
        objects.add(7);
        objects.add("sagaar");
        System.out.println(objects);

    }
}
