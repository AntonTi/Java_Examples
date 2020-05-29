package com.antonti.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // create an ArrayList object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.add(1, "Subaru"); // add element by index
        System.out.println(cars);

        String myCar = cars.get(1); // get 2d element (index 0 is 1st element)
        System.out.println(myCar);

        cars.set(0, "Opel"); // change an element (old element will be deleted)
        System.out.println(cars);

        cars.remove(0); // remove an element by index
        System.out.println(cars);

        cars.remove("Ford"); // remove an element
        System.out.println(cars);

        System.out.printf("ArrayList has %d elements \n", cars.size()); // array size

        // check for an element
        if (cars.contains("BMW")) {
            System.out.println("ArrayList contains BMW");
        }

        // Loop through an ArrayList
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // Loop through an ArrayList with the for-each
        for (String i : cars) {
            System.out.println(i);
        }

        // convert ArrayList to Array
        Object[] arrCars = cars.toArray();
        for (Object car : arrCars) {
            System.out.println(car);
        }

        // sort elements (need to import java.util.Collections)
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }

        cars.clear(); // remove all elements
        System.out.println(cars);

        // set the capacity of the array
        ArrayList<String> cars2 = new ArrayList<String>(15);
        cars2.ensureCapacity(15);

        // Other types ArrayList (Integer, Boolean, Character, Double, etc)
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }

    }
}
