package PrajwalPrograms.streampractiseArray4;

import java.util.stream.Collectors;

public class CImp {  //remove duplicates and return result in string

    public static void main(String[] args) {

        String ss = "happynewYear";

        String cc = ss.chars().mapToObj(x -> (char) x).distinct().map(x -> Character.toString(x)).collect(Collectors.joining());
        System.out.println(cc);

    }
}
