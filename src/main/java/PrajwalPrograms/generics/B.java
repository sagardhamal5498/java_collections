package PrajwalPrograms.generics;

import java.util.Comparator;

public class B {

    public static void main(String[] args) {


        A<String> a1=new A("dolly");
        System.out.println(a1.get());

        A<Double> a2= new A<>(20.63);
        System.out.println(a2.get());

        A a3=new A(89.098);
        System.out.println(a3.get());

    }
}
