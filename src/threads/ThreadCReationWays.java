package threads;

public class ThreadCReationWays {
    //there are two ways
    //first extend from thread file
    //threads work asyncronise inthe run synronic



    public static void main(String[] args) {
        //all java programs started default main thread
        System.out.println("current thread:" + Thread.currentThread().getName());


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("working thread:" + Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("anony sleep");


            }
        });
        thread3.start();
        Thread thread4 = new Thread(() -> {
            //body of run method
            System.out.println("working thread:" + Thread.currentThread().getName());
            System.out.println("lambda started thread created");


        });

        thread4.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main exec comp");
    }

    class MyThread extends Thread {
        public void run() {
            System.out.println("current thread:" + Thread.currentThread().getName());

            // System.out.println("my t work perfect");
        }
        //second way creat thread implement runnable interface

    }

    class Myrun implements Runnable {

        @Override
        public void run() {
            //if only one method implements that interface functional interface
            System.out.println("working thread:" + Thread.currentThread().getName());
            System.out.println("runnable started thread created");
        }
    }
}