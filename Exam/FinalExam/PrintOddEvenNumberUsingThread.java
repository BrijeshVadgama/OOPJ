// 2022_Q4_C(1) : Write a program to create two threads, one thread will print odd numbers and second thread will print even numbers between 1 to 20 numbers.

class Threadodd_even extends Thread {
    Threadodd_even() {
        start();
    }

    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd Number :: " + i);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException ae) {
            System.out.println("Exception :: " + ae.toString());
        }
    }
}

public class PrintOddEvenNumberUsingThread {
    public static void main(String[] args) {
        new Threadodd_even();
        try {
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even Number :: " + i);
                    Thread.sleep(3000);
                }
            }
        } catch (InterruptedException ae) {
            System.out.println("Exception :: " + ae.toString());
        }
    }
}
