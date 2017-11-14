package org.yateesha.runnable.model;

public class LongWrapper {
    private long l;
    private final Object key = new Object();

    public LongWrapper(long l) {
        this.l = l;
    }

    public long getValue() {
        return l;
    }

    public void incrementValue() {
        synchronized (key){
            l = l + 1;
        }

    }
}
