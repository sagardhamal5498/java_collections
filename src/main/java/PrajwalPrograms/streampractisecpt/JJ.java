package PrajwalPrograms.streampractisecpt;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JJ {

    public static void main(String[] args) {

        String s1="sagar";
        String s2="garsa";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean equals = Arrays.equals(c1, c2);
        System.out.println(equals);

//        boolean s21 = s1.contains(s2);
//        System.out.println(s21);

        List<Long> list = Arrays.asList(23l, 13l, 2l, 43l,500l);

        list.stream().max(Comparator.comparingLong(x -> x)).stream().toList();

//        list.remove(13l);
//        System.out.println(list);


//        Long l = list.stream().max(Comparator.comparingLong(x -> x)).get();
//        System.out.println(l);

//        long max = list.stream().mapToLong(x -> Long.valueOf(x)).max().getAsLong();
//        System.out.println(max);

//        List<Long> collect = list.stream().max(Comparator.comparingLong(x -> x)).stream().collect(Collectors.toList());
//        System.out.println(collect);



//        list.stream().mapToLong(x->Long.valueOf(x)).forEach(x->System.out.println(x));

//        System.out.println(list);

//        int []a={4,54,23,65,12,98,43};   //98 65 54 43 23 12 4
//        int max=0;
//        int temp=0;
//
//        int i1 = Arrays.stream(a).max().getAsInt();
//        int i2 = Arrays.stream(a).filter(x -> x != i1).max().getAsInt();
//        int i3 = Arrays.stream(a).filter(x -> x != i2 && x!=i1).max().getAsInt();
//        int i4 = Arrays.stream(a).filter(x -> x != i1 && x!=i2 && x!=i3).max().getAsInt();
//        int i5 = Arrays.stream(a).filter(x -> x != i1 && x!=i2 && x!=i3 && x!=i4).max().getAsInt();
//        System.out.println(i5);

//        for(int i=0;i<a.length-1;i++){
//
//            if(a[i]>max){
//                max=a[i];
//                temp=a[i];
//            }
//        }
//
//        for(int i=0;i<a.length-1;i++){
//
//            if(a[i]>max && max!=temp){
//                max=a[i];
//                temp=a[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(temp);

    }
}
