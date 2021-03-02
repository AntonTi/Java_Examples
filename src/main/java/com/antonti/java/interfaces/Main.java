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
        p.print();  // Foreign Affairs
        String name = ((Journal) p).getName();
        System.out.println(name);   // Foreign Affairs

        Printable.read();   // Read printable

        WaterPipe pipe = new WaterPipe();
        pipe.printState(1); // Water is opened

        //--------------------------------------
        Printable printable2 = createPrintable("Foreign Affairs", false);
        printable2.print(); //Foreign Affairs

        read(new Book("Java for impatients", "Cay Horstmann")); // Java for impatients (Cay Horstmann)
        read(new Journal("Java Dayly News")); // Java Dayly News

    }


    static void read(Printable p) {
        p.print();
    }

    static Printable createPrintable(String name, boolean option) {
        if (option)
            return new Book(name, "Undefined");
        else
            return new Journal(name);
    }

}
