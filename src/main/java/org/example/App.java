/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        int principal = scan.nextInt();

        System.out.print("Enter the rate of interest: ");
        double interest = scan.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();

        double interest_rate = interest / 100;
        double investment_amount = Math.round(principal * (1 + (interest_rate * years)) * 100.0) / 100.0;

        System.out.println("After " + years + " years at " + interest + "%, the investment will be worth $" + investment_amount + ".");
    }
}
