package com.marianasena.entities;

public class StringManipulation {
    public static void main(String[] args) {
        String firstName = "Mariana";
        String lastName = "Sena";

        String fullName = firstName + " " + lastName;

        System.out.println("Full name: " + fullName);
        System.out.println("Number of characters:: " + fullName.length());
        System.out.println("First character: " + fullName.charAt(0));
    }
}
