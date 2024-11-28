package ThreadsP.practise;

public class A implements Runnable{

    public void run() {

        for(int i=0;i<=10;i++){

            if(i%2==0){  System.out.println( Thread.currentThread().getName() +" "+ i); }

            try { Thread.sleep(1000); } catch (InterruptedException e) {throw new RuntimeException(e); }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        A a1=new A();

        Thread tt=new Thread(a1);
        tt.setName("Thread=1");
        tt.start();
        tt.join();

        Thread tt2=new Thread(a1);
        tt2.setName("Thread=2");
        tt2.start();
        tt2.join();

    }

}
