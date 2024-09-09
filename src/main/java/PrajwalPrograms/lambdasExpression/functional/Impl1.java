package PrajwalPrograms.lambdasExpression.functional;

public class Impl1 {

    public static void main(String[] args) {

        Func<String, Integer> f1= x->x.length();
        System.out.println(f1.apply("prajw"));

        System.out.println();

        Func<Integer,Integer> f2= x->x*x*x;
        System.out.println(f2.apply(2));
    }
}
