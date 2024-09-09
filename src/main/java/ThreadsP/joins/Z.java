package ThreadsP.joins;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Z {



    public static void main(String[] args) {

        List<String> data = Arrays.asList("jio", "king#ki", "p@oker", "pi#sf");

        List<String> collect = data.stream().filter(x -> x.matches(".*[^a-zA-Z].*")).collect(Collectors.toList());
        System.out.println(collect);
    }
}
