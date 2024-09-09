package ThreadsP.consumerproducer;

public class Consumer extends Thread{

    public Company company;

    public Consumer(Company company){
        this.company=company;
    }

    @Override
    public void run() {
        while(true) {
            try {
                company.consume_item();
                Thread.sleep(3000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}
