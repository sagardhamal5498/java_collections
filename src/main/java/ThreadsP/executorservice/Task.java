package ThreadsP.executorservice;

public class Task extends Thread{

    String s;

    public Task(String str){
        this.s=str;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+" executions started " +s);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName()+" execution finished "+ s);
    }
}
