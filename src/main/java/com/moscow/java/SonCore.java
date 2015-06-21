package com.moscow.java;

/**
 * Created by messi on 28.03.2015.
 */
public class SonCore extends Core {
    private int count;

    public SonCore() {
    }

    public SonCore(String name, int count) {
        super(name);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
