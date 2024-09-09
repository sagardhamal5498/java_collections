package PrajwalPrograms.lambdasExpression.predicate;

import java.util.function.Function;

public class Impl {

    public static void main(String[] args) {

        Pred<Integer> p= x->x%2==0;
        System.out.println(p.test(100));

        System.out.println();

        Pred<String> p1= x->x.length()<5;
        System.out.println(p1.test("prajwal"));
        System.out.println(p1.test("jio"));

        Function<Integer,Boolean> f= x->x.equals(12);
        System.out.println();

    }
}
