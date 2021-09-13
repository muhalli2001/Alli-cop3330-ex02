package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;  // Import a scanner for user input
public class App {

    public static void main(String[] args) {
        Scanner NAME = new Scanner(System.in);
        System.out.println("What is the input string?");
        String name = NAME.nextLine(); //change Scanner to string
        System.out.println(name + " has "+name.length()+" letters");//built in length function used

    }
}
