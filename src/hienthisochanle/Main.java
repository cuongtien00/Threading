package hienthisochanle;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread start!");
        OddThread oddThread = new OddThread();
        Thread t1 = new Thread(oddThread);
        t1.start();
        t1.join();
        System.out.println("OddThead is success!");
        System.out.println("----------------");
        Thread t2 = new Thread(new EvenThread());
        t2.start();
        System.out.println("MainThread is success!");

    }




}
