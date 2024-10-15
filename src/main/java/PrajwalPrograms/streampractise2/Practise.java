package PrajwalPrograms.streampractise2;

import java.util.*;
import java.util.stream.Collectors;

public class Practise {

    public static void main(String[] args) {

        List<String> data = List.of( "level","racecar", "rotor", "hello","kukukukuk");
        HashMap<String,Integer> hm=new HashMap<>();

//        List<String> list = data.stream().filter(x -> x.equals(new StringBuilder(x).reverse().toString())).toList();
//        System.out.println(list);

        data.stream().filter(x -> x.equals(new StringBuilder(x).reverse().toString()))
                .map(x->hm.put(x,x.length()));
        

        System.out.println(hm);

    }
}
