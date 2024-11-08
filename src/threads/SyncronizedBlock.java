package threads;

public class SyncronizedBlock {
    //prit [[[[[]]]]] 14 lines two thread
    public static void main(String[] args) {
        Bra bra1=new Bra();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <8 ; i++) {
                    bra1.printBra();


                }

            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <8; i++) {
                    bra1.printBra();

                }

            }
        });
        thread1.start();
        thread2.start();
    }

}
class Bra{
    public synchronized void printBra(){
        for (int i = 1; i <11 ; i++) {
            if (i<6){
                System.out.print("[");

            }else {
                System.out.print("]");
            }

        }System.out.println(Thread.currentThread().getName());
    }
}