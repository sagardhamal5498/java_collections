package PrajwalPrograms.streampractise2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class A {  //string array and u need to sort them by their length

    public static void main(String[] args) {

        String []s={"jio","lion","aa","kinggi","b"};
        String  temp=null;

//        List<String> collect = Arrays.stream(s).sorted(Comparator.comparing(x -> x.length())).collect(Collectors.toList());
//        System.out.println(collect);

        for(int i=0;i<s.length-1;i++){
            for(int j=i+1;j<s.length;j++){

                if(s[i].length()>s[j].length()){
                    temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }

        for(String str:s){
            System.out.println(str);
        }

    }
}
