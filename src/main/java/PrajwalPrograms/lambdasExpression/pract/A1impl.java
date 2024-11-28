package PrajwalPrograms.lambdasExpression.pract;

public class A1impl {

    public static void main(String[] args) {

        A1 aa=(a,b,c)->{

            int z= a+b+c;

            System.out.println(z);

        };

        aa.test(12,23,12);
    }

}
