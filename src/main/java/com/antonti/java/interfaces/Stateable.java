package com.antonti.java.interfaces;

public interface Stateable {
    int OPEN = 1;   //by default public static final
    int CLOSED = 0;

    void printState(int n);
}
