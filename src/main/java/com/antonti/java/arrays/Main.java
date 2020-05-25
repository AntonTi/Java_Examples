package com.antonti.java.arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[4]; //array of 4 numbers
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 6;
        nums1[3] = 100;
        System.out.println(nums1[2]); //output 3d element of array (6)
        System.out.println(nums1.length); //output array length (4)
        System.out.println(nums1[nums1.length - 1]); //output last element of array (100)

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; //array of 4 words
        int[] nums2 = {3, 15, 8, 4, 24, 2, 8}; //array of 7 numbers

        //Loop Through an Array (output all elements of array)
        for (int i = 0; i < nums2.length; i++) {
            //nums2[i] *= 2;
            System.out.println(nums2[i]);
        }

        //Loop Through an Array with For-Each (output all elements of array)
        for (int n : nums2) {
            //n = n * 2;
            System.out.println(n);
        }

        //Multidimensional Arrays
        int[][] nums3 = new int[2][3]; // 2 rows, 3 cols
        int[][] nums4 = {{0, 1, 2}, {3, 4, 5}};
        int n = nums4[1][0];
        System.out.println(n); //output 3

        //Loop Through an two-dimensional Array (output all elements of array)
        for (int i = 0; i < nums4.length; i++) {
            for (int j = 0; j < nums4[i].length; j++) {
                System.out.printf("%d ", nums4[i][j]);
            }
            System.out.println();
        }

    }
}

