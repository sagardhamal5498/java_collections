package PrajwalPrograms.streampractiseArray4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BB {

    public static void main(String[] args) {

        String[] s = {"jackie", "tommy", "henry"};

        List<String> result = Arrays.stream(s)
                .map(str -> IntStream.range(0, str.length())
                        .mapToObj(i -> i % 2 == 0
                                ? String.valueOf(Character.toUpperCase(str.charAt(i)))
                                : String.valueOf(str.charAt(i)))
                        .collect(Collectors.joining()))
                .collect(Collectors.toList());

        System.out.println(result);

//        String s[]={"jackie","tommy","henry"};

//        for(int i=0;i<s.length;i++){
//
//            String ss=s[i];
//            StringBuilder sb = new StringBuilder();
//            for(int j=0;j<ss.length();j++){
//                if(j%2==0){
//                    sb.append(Character.toUpperCase(ss.charAt(j)));
//                }else{
//                    sb.append(ss.charAt(j));
//                }
//            }
//            System.out.println(sb);


        }



}
