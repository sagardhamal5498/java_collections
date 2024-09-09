package ThreadsP.basicImplementation;

public class B implements Runnable{

    public void run(){

        for(int i=1;i<=10;i++){
            System.out.println("Thread One :-"+ i);
            try{Thread.sleep(1000);}catch (Exception e){   }
        }
    }


    public static void main(String[] args) {

        B b=new B();

        Thread thread=new Thread(b);   //add object manually into thread bcoz runnable dont have start method
        thread.start();

        A a1=new A();
        a1.start();

    }
}
