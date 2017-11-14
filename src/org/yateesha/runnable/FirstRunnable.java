package org.yateesha.runnable;

public class FirstRunnable {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            System.out.println("I am running in "+ Thread.currentThread().getName());
        };
        Thread thread1 = new Thread(runnable);
        thread1.setName("First Thread");
        thread1.start();
    }
}
