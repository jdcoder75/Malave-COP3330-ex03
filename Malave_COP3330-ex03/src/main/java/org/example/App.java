package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jose Malave
 */
public class App {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("What is the quote?" );
        String quote = sc.nextLine();
        System.out.println("What is the quote?" );
        String name= sc.nextLine();
        System.out.println(name + " says " +  "\"" + quote +"\"");
    }
}
