package taoLuongBangRunnable;

public class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println(threadName + " Dang tao ");

    }

    @Override
    public void run() {
        System.out.println(threadName + " running");
            try {
                for (int i = 0; i < 4; i++) {
                    System.out.println("Thread: " + threadName + "," + i);
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.println("Thread: " + threadName  + " exiting");
    }
    public void start(){
        System.out.println("Starting " + threadName);
        if(t==null){
            t= new Thread(this, threadName);
            t.start();
        }
    }
}
