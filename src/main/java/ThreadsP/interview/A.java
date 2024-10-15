package ThreadsP.interview;

public class A
{

    private static int current = 1; // Shared number
    private static final Object lock = new Object(); // Lock for synchronization


    public static void main(String[] args) throws InterruptedException {

        Runnable printTask = () -> {
            while (true) {
                synchronized (lock) {
                    if (current > 10) break; // Stop after printing 10
                    System.out.println(Thread.currentThread().getName() + " printed: " + current);
                    current++; // Increment the number
                    lock.notifyAll(); // Notify other threads
                    try {
                        lock.wait(); // Wait for the next turn
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        // Create 3 threads
        Thread t1 = new Thread(printTask, "Thread 1");
        Thread t2 = new Thread(printTask, "Thread 2");
        Thread t3 = new Thread(printTask, "Thread 3");

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
    }

