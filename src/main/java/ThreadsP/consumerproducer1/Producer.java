package ThreadsP.consumerproducer1;

public class Producer extends Thread{

    public Company company;

    Producer(Company company){
        this.company=company;
    }

    @Override
    public void run() {
        int i=1;

        while(true) {
            try {
                Thread.sleep(1000);
                company.producer(i);
                i++;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

    }
}
