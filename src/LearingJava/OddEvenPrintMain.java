package LearingJava;

public class OddEvenPrintMain {

    boolean odd;
    int count = 1;
    int MAX = 10;

    public void printOdd(){
        synchronized (this) {
            while (count < MAX) {
                System.out.println("Checking odd loop");
                while (!odd) {
                    try {
                        System.out.println("Odd waiting : "+count);
                        wait();
                        System.out.println("notified odd :"+count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd Thread : "+count);
                count++;
                odd = true;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        OddEvenPrintMain oddEvenPrintMain = new OddEvenPrintMain();
    }
}
