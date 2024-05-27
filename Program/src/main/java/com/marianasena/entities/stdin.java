package com.marianasena.entities;

import java.util.Scanner;

public class stdin {

        //Standard in
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Type something: ");
            String in = scanner.nextLine();
            System.out.println("You typed: " + in);

            scanner.close();
        }
 }


