package taoLuongBangRunnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thread main starting");
        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-in-du-lieu");

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-nap-chong");

        runnableDemo1.start();
        runnableDemo2.start();
        System.out.println("Thread main exiting");

    }
}
