package PrajwalPrograms.streampractise;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class G {

    public static void main(String[] args) {  //count the no. of vowels in string ,optimized solution is also there

        String s="sagardumal";

//        Map<Character, Long> collect = s.chars().mapToObj(x -> (char) x).filter(x -> x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u').collect(Collectors.groupingBy(x -> x, Collectors.counting()));
//        System.out.println(collect);

        long sum=s.chars().mapToObj(x -> (char) x).filter(x -> x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u').collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().stream().mapToLong(x->x.getValue()).sum();
        System.out.println(sum);

        //optimized
        int count=0;
        for(int i=0;i<s.length();i++){

            if(List.of('a','e','i','o','u').contains(s.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
