package Count;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();

        while(count.getThread().isAlive()){
            System.out.println("Main thread van con chay khi nao ma thread con van dang chay");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread main chay xong");
    }
}
