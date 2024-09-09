package PrajwalPrograms.lambdasExpression;

public class Impl {

    public static void main(String[] args) {

        //lambdas can be used in 2 ways if you want to write only one line of code:--->

        A a1= () ->{
            System.out.println("hello");
        };

        A a2= () -> System.out.println("worldd!!!");
        a1.tt();

//        ------------------------------------------------------

        B b1= (x,y)-> x+y;
        System.out.println(" b1 :--" +b1.test(23,10));

        B b2= (int t, int u) -> t *u;
        System.out.println(" b2 :--" +b2.test(10,21));

        B b3= (y,z) ->{
            return y+z;
        };
        System.out.println(" b3 :--" + b3.test(22,20));
    }



}
