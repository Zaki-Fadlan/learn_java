package org.example;

public class Main extends Thread {
    String message;

    public Main(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        Main thread1 = new Main("Thread 1");
        Main thread2 = new Main("Thread 2");

        thread1.start();
        thread2.start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

