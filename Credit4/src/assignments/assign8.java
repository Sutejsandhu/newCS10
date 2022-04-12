/*

Program: assign8.java        Date: April 12, 2022


Author: Sutej Sandhu
School: CHHS
Course: Computer Science 10
 

*/


package assignments;

import java.util.Scanner;


public class assign8
{
 public static void main(String args[])
    {
       Scanner userinput = new Scanner(System.in);
       System.out.println("Enter three digits: ");
       int digit = userinput.nextInt();
       int first = digit / 100;
       int second = (digit % 100) /10;
       int third = digit % 10;
       System.out.println("The hundreds place digit is: " +first);
       System.out.println("The tens place digit is: " +second);
       System.out.println("The ones place digit is: " +third);

       
    }

}

/* Screen Dump
 
Enter three digits: 
734
The hundreds place digit is: 7
The tens place digit is: 3
The ones place digit is: 4

 
 */