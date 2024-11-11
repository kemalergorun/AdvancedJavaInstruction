package threads;

import java.util.concurrent.CountDownLatch;


    /*
    We can make a thread wait before multiple threads (worker threads) to be done with their work,
    and then continue the process using a CountDownLatch.
     */
    public class CountdownLatch1 {
        //TASK: Main thread and thread-0 should wait before worker threads are done with  their work.
        public static void main(String[] args) {

            System.out.println("Main thread started working.");

            CountDownLatch latch = new CountDownLatch(3);
        /*
        //Since the number will never reach 0 in this configuration, application will never exit.
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        */
            Thread thread1 = new Thread(()->{
                System.out.println(Thread.currentThread().getName() + " started working.");
                //worker1.join(); worker1 is not defined before this line.
                try {
                    latch.await(); //Waits until worker threads are done, AKA (also known as) countdown reaching 0.
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " continuing the work.");
                System.out.println(Thread.currentThread().getName() + " finished working.");
            });
            thread1.start();

            Thread thread2 = new Thread(()->{
                try {
                    latch.await(); //Waits until worker threads are done, AKA (also known as) countdown reaching 0.
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }//Will wait for countdown to reach 0, to start working.

                System.out.println(Thread.currentThread().getName() + " started working.");
                //worker1.join(); worker1 is not defined before this line.
                System.out.println(Thread.currentThread().getName() + " continuing the work.");
                System.out.println(Thread.currentThread().getName() + " finished working.");
            });
            thread2.start();

            WorkerThreads worker1 = new WorkerThreads("A",5000,latch);
            WorkerThreads worker2 = new WorkerThreads("B",7000,latch);
            WorkerThreads worker3 = new WorkerThreads("C",9000,latch);

            worker1.start();
            worker2.start();
            worker3.start();

            try {
                latch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Main thread continues working.");
        }
    }

    class WorkerThreads extends Thread{
        public int duration;
        public CountDownLatch latch;

        public WorkerThreads(String name, int duration, CountDownLatch latch) {
            super(name);
            this.duration = duration;
            this.latch = latch;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " started working.");
            try {
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " finished working.");
            latch.countDown(); //Will decrease the count by 1. Countdown will be like: 3->2->1->0
        }
    }









