package PrajwalPrograms.streampractiseArray2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CImp { // Find the Longest Substring with All Unique Characters in an Array of Strings

    public static void main(String[] args) {

        String[] words = {"abcabcbb", "bbbbb","tyuioplhjg", "pwwkew", "abcdefg"};

//        List<String> collect1 = Arrays.stream(words).filter(
//                (x) -> {
//                    List<Character> collect = x.chars().mapToObj(y -> (char) y).distinct().collect(Collectors.toList());
//                    if (collect.size() == x.length()) {
//                        return true;
//                    } else {
//                        return false;
//                    }
//                }
//        ).collect(Collectors.toList());

        List<String> collect1 = Arrays.stream(words).filter(
                (x) -> {
                    List<Character> collect = x.chars().mapToObj(y -> (char) y).distinct().collect(Collectors.toList());
                    if (collect.size() == x.length()) {
                        return true;
                    } else {
                        return false;
                    }
                }
        ).max(Comparator.comparingInt(x -> x.length())).stream().collect(Collectors.toList());

        System.out.println(collect1);
    }
}
