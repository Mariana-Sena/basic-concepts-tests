package com.marianasena.entities;

import java.util.Scanner;

public class FinallyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Type a number: ");
            int numero = scanner.nextInt();
            int resultado = 10 / numero;
            System.out.println("Result: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        } finally {
            // This block will always be executed, regardless of exceptions.
            System.out.println("The 'finally' block has been executed.");
            scanner.close();
        }
    }
}