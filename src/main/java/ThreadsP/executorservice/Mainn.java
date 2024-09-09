package ThreadsP.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Mainn {

    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(2);

        es.submit(new Task("task 1"));
        es.submit(new Task("task 2"));
        es.submit(new Task("task 3"));

        es.shutdown();

        //Uses Executors.newFixedThreadPool(2) to create a thread pool with 2 threads.
        //Submits three SimpleTask instances to the executor. Since there are only 2 threads, the third task will wait until one of the first two tasks is finished.
        //Calls shutdown to stop accepting new tasks and finish executing the submitted tasks.

    }
}
