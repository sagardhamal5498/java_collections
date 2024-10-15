package ThreadsP.synchronization;

public class Prac1 {

    static int balance=0;

    static synchronized void addBalance(int i){

        for(int k=1;k<=i;k++){
            balance++;
        }
        System.out.println(balance);
    }


    static synchronized void deductBalance(int d){

        for(int k=1;k<=d;k++){
            balance--;
        }
        System.out.println(balance);
    }

}
