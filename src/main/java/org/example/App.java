/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int numYears;
        double principal, interest, acabou ;

        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        principal = keyboardInput.nextDouble();

        System.out.print("Enter the rate of interest: ");
        interest = keyboardInput.nextDouble();

        System.out.print("Enter the number of years: ");
        numYears = keyboardInput.nextInt();

        acabou = principal * ( 1 + (interest / 100 * numYears) );

        System.out.println("After " + numYears + " years at " + interest + "%, the investment will be worth $" + String.format("%.2f",acabou) + ".");






    }
}
