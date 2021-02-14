package com.antonti.java.interfaces;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
        b1.print();     //  Java. Complete Reference (H. Shildt)

        Printable printable = new Book("Java. Complete Reference", "H. Shildt");
        printable.print();      //  Java. Complete Reference (H. Shildt)
        printable = new Journal("Foreign Policy");
        printable.print();      // Foreign Policy

        Printable p = new Journal("Foreign Affairs");
        p.print();  //// Foreign Affairs
        String name = ((Journal) p).getName();
        System.out.println(name);   // Foreign Affairs

        Printable.read();   // Read printable
    }
}
