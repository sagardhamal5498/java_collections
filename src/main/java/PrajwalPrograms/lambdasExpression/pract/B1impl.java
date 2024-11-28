package PrajwalPrograms.lambdasExpression.pract;

public class B1impl {

    public static void main(String[] args) {

        B1<Integer> bb= (x)->{

            return x%2==0;
        };

        boolean result = bb.test(200);

        System.out.println(result);


        B1<Integer> bb2= x->x%2!=0;
        System.out.println(bb2.test(13));
        System.out.println(bb.test(13));

    }

}
