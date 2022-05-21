package com.antonti.java.arrayAndArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // FROM ARRAYLIST TO ARRAY
        List<String> lstNames = new ArrayList<String>(); //create an ArrayList
        lstNames.add("Petya"); //add element to ArrayList
        lstNames.add("Masha");
        lstNames.add("Andry");
        lstNames.add("Vova");
        lstNames.add("Dima");

        String[] arrNames = lstNames.toArray(new String[0]); //create an Array from ArrayList
        for (String s : arrNames) {
            System.out.println(s);
        }

        System.out.println("2nd array sorted ~~~~~~~~~~~~~~~~~~~");

        String[] arrNamesSort = arrNames.clone(); //clone 2nd array from 1st
        Arrays.sort(arrNamesSort); //sort 2nd array
        arrNamesSort[0] = "Dasha"; //change the 1st element in the 2nd array
        for (String s : arrNamesSort) {
            System.out.println(s);
        }

        boolean result = Arrays.equals(arrNames, arrNamesSort); //compare arrays
        if (result) {
            System.out.println("Arrays are equal");
        } else System.out.println("Arrays are not equal");


        // ADD MULTIPLE ELEMENTS TO AN ARRAYLIST AT ONCE
        String[] arrCars = {"Volvo", "BMW", "Ford", "Mazda"}; //1st step: create an array with elements
        List<String> lstCars = Arrays.asList(arrCars); //2nd step: create list from this array
        System.out.println(lstCars);

    }
}
