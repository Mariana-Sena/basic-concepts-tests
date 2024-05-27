package com.marianasena.entities;


import java.util.Arrays;
public class ArrayExample {
    public static void main(String[] args) {
        // Declaring and initializing an integer array
//        int[] numbers = {1, 2, 3, 4, 5};
//        int[] numbers = {1, 2, Mariana, 4, 5};
//        int[] numbers = {1, 2, 309283657801, 4, 5}; too large
          int[] numbers = {12, 452, 3446876, 2090, -9000};


        // Iterating over the array and displaying the elements
        for (int num : numbers) {
            System.out.println(num);
        }

        // Sum of array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }
}
