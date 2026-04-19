package PrajwalPrograms.lambdasExpression.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Impl {

    public static void main(String[] args) {

        Pred<Integer> p= x->x%2==0;
        System.out.println(p.test(100));

        System.out.println();

        Pred<String> p1= x->x.length()<5;
        System.out.println(p1.test("prajwal"));
        System.out.println(p1.test("jio"));


//        Predicate<Integer> predu=x->x%2==0;
//        List<Integer> data = Arrays.asList(12, 23, 11, 34, 21);
//        List<Integer> result = data.stream().filter(predu).toList();
//        System.out.println(result);

    }
}
