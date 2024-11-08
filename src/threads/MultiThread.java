package threads;

public class MultiThread {
    public static void main(String[] args) {

       // Counter counter1=new Counter("bob");
       // Counter counter2=new Counter("mike");
//counter1.count();
     //   counter2.count();
        Thread thread1=new CounterThread("john");
        Thread thread2=new CounterThread("jack");
        thread1.start();
        thread2.start();

    }
}
//class Counter{
 //   public String name;

  //  public Counter(String name) {
  //      this.name = name;
   // }

   // public void count(){
      //  for (int i = 1; i <16 ; i++) {
      //      try {
      //          Thread.sleep(500);
      //      } catch (InterruptedException e) {
      //          throw new RuntimeException(e);
       //     }
      //      System.out.println(i + "counter name " +this.name);
     //   }

 //   }
//}
class CounterThread extends Thread{
    public String name;

    public CounterThread(String name) {
        this.name = name;

        }

    public CounterThread(String name, String name1) {
        super(name);
        this.name = name1;
    }

    public void count(){
            for (int i = 1; i <16 ; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i + "counter name " + this.name);

                {

                }


            }
    }}