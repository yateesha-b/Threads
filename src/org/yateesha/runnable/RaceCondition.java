package org.yateesha.runnable;

import org.omg.IOP.TAG_JAVA_CODEBASE;
import org.yateesha.runnable.model.LongWrapper;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0L);
        Runnable r = () ->{
            for (int i = 0; i < 1000; i++) {
                longWrapper.incrementValue();
            }
        };
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < threads.length ; i++) {
            threads[i] = new Thread(r);
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        System.out.println("Value = "+longWrapper.getValue());
    }
}
