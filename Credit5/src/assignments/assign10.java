/*

Program: assign10.java          Date: April 28, 2022


Author: Sutej Sandhu 
School: CHHS
Course: Computer Science 10
 

*/


package assignments;

import java.util.Scanner;


public class assign10 
{
 public static void main(String args[])
    {
       Scanner userinput = new Scanner(System.in);
       System.out.println("Enter an integer: ");
       int digit = userinput.nextInt();
       if (digit % 2 == 0) {
           System.out.println("Your integer " +digit+ " is even!");
                   } else {
           System.out.println("Your integer " +digit+ " is odd");
       }
       
    }

}

/* Screen Dump
 
Enter an integer: 
12
Your integer 12 is even!

Enter an integer: 
5125
Your integer 5125 is odd
 
Enter an integer: 
-123451591
Your integer -123451591 is odd

Enter an integer: 
512412
Your integer 512412 is even!

 */