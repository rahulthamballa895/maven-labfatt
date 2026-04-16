package com.example;

import java.util.Scanner;

public class Library {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Books issued: ");
        int books = sc.nextInt();

        System.out.print("Days borrowed: ");
        int days = sc.nextInt();

        App app = new App();
        int fine = app.calculateFine(days);

        System.out.println("\n--- DETAILS ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Books issued: " + books);
        System.out.println("Days: " + days);
        System.out.println("Fine: Rs." + fine);
    }
}
