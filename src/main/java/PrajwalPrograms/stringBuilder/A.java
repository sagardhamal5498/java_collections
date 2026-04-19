package PrajwalPrograms.stringBuilder;

public class A {

    public static void main(String[] args) {

//        String str="jiok";
//
//        StringBuilder sb=new StringBuilder(str);

//        //deletecharAt wala
//        sb.deleteCharAt(0);
//        sb.deleteCharAt(0);
//        System.out.println(sb);

//        //delete(start,end)
//        sb.delete(1,3);
//        System.out.println(sb);

        //reverse()
//        sb.reverse();
//        System.out.println(sb);

//        insert('') OR insert(" ")
//        sb.insert(1,'k');
//        System.out.println(sb);
        //OR
//        sb.insert(1,"king");
//        System.out.println(sb);

//        "[0-9]{2}"

        String str="345" ;
        boolean bb = str.matches("[0-5]{3}");
        System.out.println(bb);


    }
}
