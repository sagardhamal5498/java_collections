package PrajwalPrograms.lambdasExpression;

import java.util.function.Predicate;

public class Impl2 {

    public static void main(String[] args) {

        C c1= x-> x*x;
        System.out.println(c1.tt(12));

        D<Integer> d1= x-> x%2==0;
        System.out.println(d1.pp(22));
        System.out.println(d1.pp(45));

    }
}
