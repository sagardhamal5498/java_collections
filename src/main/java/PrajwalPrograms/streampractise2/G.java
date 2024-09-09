package PrajwalPrograms.streampractise2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class G {  //  Convert a string to title case (where the first letter of each word is capitalized) using the Stream API.

    public static void main(String[] args) {

        String s="hello jio aa pociie" ;

        List<String> collect = Arrays.stream(s.split(" ")).map(x -> Character.toUpperCase(x.charAt(0))+x.substring(1)).collect(Collectors.toList());
        System.out.println(collect);

//        List<String> collect = Arrays.stream(s.split(" ")).map(x -> Character.toUpperCase(x.charAt(0)) + x.substring(1)).collect(Collectors.toList());
//        System.out.println(collect);

        //without stream  api
//        String[] ss = s.split(" ");
//        StringBuilder sb=new StringBuilder();
//
//        for (int i=0;i<ss.length;i++){
//
//             String res = Character.toUpperCase(ss[i].charAt(0)) + ss[i].substring(1);
//             sb.append(res+ " ");
//        }
//        System.out.println(sb);

    }
}
