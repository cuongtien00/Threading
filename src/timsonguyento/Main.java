package timsonguyento;

public class Main {
    public static void main(String[] args) {
        OptimizedThread t1 = new OptimizedThread();
        LazyThread t2  = new LazyThread();
        Thread thread2 = new Thread(t2);
        Thread thread = new Thread(t1);

        thread2.start();
        thread.start();
    }
}
