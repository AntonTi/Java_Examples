package com.antonti.java.loops;

public class Main {
    public static void main(String[] args) {

        //calculate the square of a number
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Square of a number %d is %d \n", i, i * i);
        }

        //multiplication table
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }

        //LOOP INSIDE LOOP
        String text = "Hello";
        int i = 0;

        //text matrix (for)
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%s ", text);
            }
            System.out.println();
        }
        System.out.println("````````````````````");

        //text matrix (while)
        i = 0;
        while (i < 5) {
            int j = 0;
            while (j < 10) {
                System.out.printf("%s ", text);
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("````````````````````");

        //text matrix (do while)
        i = 0;
        do {
            int j = 0;
            do {
                System.out.printf("%s ", text);
                j++;
            } while (j < 10);
            System.out.println();
            i++;
        } while (i < 5);

    }
}
