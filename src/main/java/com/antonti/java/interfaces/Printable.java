package com.antonti.java.interfaces;

public interface Printable {
    void print();

    default void printDef() {
        System.out.println("Undefined printable");  // default method (JDK 8 and higher) optional
    }

    static void read() {
        System.out.println("Read printable");   // JDK 8 and higher
    }
}
