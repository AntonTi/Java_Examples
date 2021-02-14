package com.antonti.java.interfaces;

public class Journal implements Printable {
    private String name;

    Journal(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
