package ThreadsP.synchronization;
//https://www.youtube.com/watch?v=RH7G-N2pa8M
public class AA {

    static int count;

    public synchronized static void increment(){   //will allow only one operation at a time
        count++;
    }
   //scenario if not used:--    count=200  t1 --> 201  t2 --> 201

    public static void main(String[] args) {

        Thread t1=new Thread( ()->{

            for(int i=0;i<1000;i++){
                increment();
            }

        });

        Thread t2=new Thread( ()->{

            for(int i=0;i<1000;i++){
                increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        //it should print actually 2000 but concurrency takes place here without synchronized keyword!!
        System.out.println(count);

    }
}
//When t1.start() is called, t1 begins executing concurrently.
//When t2.start() is called, t2 also begins executing concurrently.
//The main thread then calls t1.join(), which blocks the main thread until t1 finishes.
//After t1 completes, the main thread calls t2.join(), which blocks it until t2 finishes.
//Finally, once both threads have completed, the main thread prints the final count.