package PrajwalPrograms.streampractiseArray1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A { //Find the Array Elements with the Most Vowels

    public static void main(String[] args) {

        List<String> list = Arrays.asList("bale", "jock", "kalueo", "atty");

//        List<Long> collect = list.stream().map(x -> x.chars().mapToObj(y -> y).filter(y -> y.equals('a') && y.equals('e') && y.equals('o') && y.equals('u') && y.equals('i')).count()).collect(Collectors.toList());
//        System.out.println(collect);

//        list.stream().map(x -> x.chars().mapToObj(y -> y).filter(y -> false).collect(Collectors.groupingBy(y -> y, Collectors.counting()))).collect(Collectors.toList());
////        System.out.println(collectollect);

        String []aa={"bale", "jock", "kalueo", "atty"};

        int count=0;
        int max=0;
        String maxy=null;
        for(int i=0;i<aa.length;i++){
            String ss=aa[i];
            for(int j=0;j<ss.length();j++){

                if(ss.charAt(j)=='a' || ss.charAt(j)=='e' ||ss.charAt(j)=='i' ||ss.charAt(j)=='o' || ss.charAt(j)=='u'){
                    count++;
                }
            }
            if(count>max){
                max=count;
                maxy=ss;
                count=0;
            }
            count=0;
        }

        System.out.println(maxy);
    }
}
