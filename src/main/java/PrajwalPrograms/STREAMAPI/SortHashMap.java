package PrajwalPrograms.STREAMAPI;

import java.util.*;
import java.util.Map.Entry;

public class SortHashMap {

    public static void main(String[] args) {
        Map<String,Integer> hm=new TreeMap<>();

        hm.put("dugu",342);
        hm.put("luki",200);
        hm.put("bhetka",500);
        hm.put("kulu",100);
        System.out.println(hm);

        //1st way for sorting by values
        List<Entry<String, Integer>> tt = new ArrayList<>(hm.entrySet());
        Collections.sort(tt, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });
        System.out.println("sorting by values:- " + tt);

//        2nd way for sorting by key  //but in descending and using lambdas here
        List<Entry<String, Integer>> tt2 = new ArrayList<>(hm.entrySet());
        Collections.sort(tt2, (x,y)-> y.getKey().compareTo(x.getKey()));
        System.out.println("sorting by keys in descending:- " + tt2);


        //by using stream api-->
        List<Entry<String, Integer>> result = hm.entrySet().stream().sorted(Comparator.comparingInt(x -> x.getValue())).toList();
        System.out.println("by stream :--"+result);

//        hm.entrySet().stream().sorted(Comparator.comparingInt(map.Entry::getValue).reversed()).toList();
//        System.out.println(result2);

        //method ref. required here for descending order/reverse by values
        List<Entry<String, Integer>> result2 = hm.entrySet()
                .stream()
                .sorted(Comparator.comparingInt(Entry<String,Integer>::getValue).reversed())
                .toList();
        System.out.println("by stream values in desc order:-" +result2);
        //Note:- Entry<K,V> or Map.Entry<K,V> both are ok !!

    }
}
