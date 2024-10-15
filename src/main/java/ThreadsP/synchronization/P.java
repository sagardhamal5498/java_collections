package ThreadsP.synchronization;

public class P {

    static int balance;

    static synchronized void creditbalance(){
        balance++;
    }

    static synchronized void debitbalance(){
        balance--;
    }

    //scenario for me:-
    // concurrency ==>  balance=300               credit:- 301   debit:- 299   ; so only one thread should work at a time


}
