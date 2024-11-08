package threads;

public class Multi02 {
    public static int counter=0;

    public static void main(String[] args) {

        Thread bobthread=new Thread(()->{Counter1.count();
            System.out.println("bob here");
            System.out.println("bob here");
            System.out.println("bob here");
            System.out.println("bob here");
            System.out.println("bob here");

        });
        bobthread.setName("bob");
        bobthread.start();
        Thread mikethread=new Thread(()->{Counter1.count();
            System.out.println("mike sell ice");
            System.out.println("mike sell ice");
            System.out.println("mike sell ice");
            System.out.println("mike sell ice");
            System.out.println("mike sell ice");
            System.out.println("mike sell ice");
            System.out.println("mike sell ice");
            System.out.println("mike sell ice");
            System.out.println("mike sell ice");
            System.out.println("mike sell ice");
            System.out.println("mike sell ice");


        });
        mikethread.setName("mike");
        mikethread.start();

    }

}
class Counter1{
    public static synchronized void count(){
        for (int i = 1; i <=1000 ; i++) {
            Multi02.counter++;

        }
        System.out.println(Multi02.counter);
    }
}