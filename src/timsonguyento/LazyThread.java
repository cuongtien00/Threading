package timsonguyento;

public class LazyThread extends Thread{
    @Override
    public void run() {
        int[] arr = {1,2,3,5,6,8,9};
        for (int a:arr) {
            System.out.println("LazyThread: " + checkPrime(a));
        }
        System.out.println("LazyThread is success");

    }

    private String checkPrime(int n) {
        boolean check = false;
        if (n <2)  check = true;
        else if (n <4) check = true;

        else {
            for (int i = 2; i < (n - 1); i++) {
                if (n % i == 0)
                    check = false;
            }
            check = true;
        }
        if(check){
            return n + " la so nguyen to ";
        }
        else{
            return n + " khong phai so nguyen to";
        }
    }
}
