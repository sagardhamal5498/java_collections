package PrajwalPrograms.streampractise;

public class DImp {   // Find the First Non-Repeated Character in a String

    public static void main(String[] args) {

        String str = "sagattrs";

//        int i = str.indexOf('g');
//        int i1 = str.lastIndexOf('g');
//        System.out.println(i);
//        System.out.println(i1);

        Character c1 = str.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .findFirst()
                .orElse(null);
        System.out.println(c1);
    }


}
