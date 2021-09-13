package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables
        int lenght, width, areaFeet;
        double areaMeters;
        Scanner sc = new Scanner(System.in);

        //get user input
        System.out.println("What is the length of the room in feet?");
        lenght = sc.nextInt();
        System.out.println("What is the width of the room in feet?");
        width = sc.nextInt();

        //calculate the area in feet
        areaFeet = lenght * width;

        System.out.println("You entered dimensions of " + lenght + " feet by " + width + " feet.");
        System.out.println("The area is\n" + areaFeet + " square feet");

        //calculate the area in meters
        areaMeters = areaFeet * 0.09290304;

        System.out.println(Math.round(areaMeters*1000)/1000.0 + " square meters");

        sc.close();
    }
}