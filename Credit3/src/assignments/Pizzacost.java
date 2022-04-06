/*

Program: Pizzacost.java          Date: April 5, 2022


Author: Sutej Sandhu
School: CHHS
Course: Computer Science 10
 

*/


package assignments;

import java.util.Scanner;


public class Pizzacost 
{
 public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
     	double size = 0.0;
     	double cost = 0.0;
 	System.out.println("\nEnter the diameter of the pizza in inches: ");
     	size = sc.nextDouble();
     	cost = ((.05 * size * size) + 1 + .75);
 	System.out.println("The cost of making the pizza is: $" + cost);

       
    }

}

/* Screen Dump
 
Enter the diameter of the pizza in inches: 
10
The cost of making the pizza is: $6.75

*/