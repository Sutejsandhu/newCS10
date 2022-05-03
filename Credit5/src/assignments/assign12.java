/*

Program: assign12.java          Date: May 3, 2022


Author: Sutej Sandhu
School: CHHS
Course: Computer Science 10
 

*/


package assignments;

import java.util.Scanner;


public class assign12 
{
 public static void main(String args[])
 

	    {
	       Scanner userinput = new Scanner(System.in);
	       System.out.println("Enter your grade: ");
	       int grade = userinput.nextInt();
	       if (grade > 89)
	       {
	           System.out.println("Your grade letter is A+");
	       }
	       else if ((grade < 90)&&(grade > 79))
	       {
	           System.out.println("Your grade letter is A ");
	       }
	       else if ((grade < 80)&&(grade > 74))
	       {
	           System.out.println("Your grade letter is B+ ");
	       }
	       else if ((grade < 75)&&(grade > 69))
	       {
	           System.out.println("Your grade letter is B ");
	       }
	       else if ((grade < 70)&&(grade > 64))
	       {
	           System.out.println("Your grade letter is C+ ");
	       }
	       else if ((grade < 65)&&(grade > 59))
	       {
	           System.out.println("Your grade letter is C ");
	       }
	       else if ((grade < 60)&&(grade > 54))
	       {
	           System.out.println("Your grade letter is D+ ");
	       }
	       else if ((grade < 55)&&(grade > 49))
	       {
	           System.out.println("Your grade letter is D ");
	       }
	       else 
	       {
	           System.out.println("Your grade letter is F ");
	       }   

	       
	    }

}

	/* Screen Dump
	 
Enter your grade: 
98
Your grade letter is A+

	 
	 */