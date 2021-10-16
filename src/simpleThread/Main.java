package simpleThread;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();


        Thread t1 = new Thread(numberGenerator);
        Thread t2 = new Thread(numberGenerator);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1);
        System.out.println(t2);
        t1.start();
        t2.start();
    }



}
