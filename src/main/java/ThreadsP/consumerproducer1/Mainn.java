package ThreadsP.consumerproducer1;

public class Mainn {

    public static void main(String[] args) {

        Company company=new Company();

        Producer producer=new Producer(company);
        Consumer consumer=new Consumer(company);

        producer.start();;
        consumer.start();;
    }
}
