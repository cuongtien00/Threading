package Count;

public class Count implements Runnable {
    Thread thread;

    public Count() {
        thread = new Thread(this,"My thread");
        System.out.println("Khoi tao xong " + thread);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Dem so " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread chay xong");
    }
}
