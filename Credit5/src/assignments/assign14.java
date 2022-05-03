/*

Program: assign14.java          Date: May 3, 2022


Author: Sutej Sandhu
School: CHHS
Course: Computer Science 10

*/

package assignments;

import java.util.Scanner;


public class assign14 
{
    public static void main(String args[])
    {
        //Ask for age to verify your stage of life
        Scanner userinput = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = userinput.nextInt();
        //if else statements to determine what stage of life you belong due to your age
        if (age < 6)
        {
        System.out.println("You are a toddler");
        }
       
        else if ((age < 11)&&(age > 5))               
        {
        System.out.println("You are a child");
        }
        
        else if ((age < 13)&&(age > 10))
        {
        System.out.println("You are a preteen");
        }
       
        else if ((age < 18)&&(age > 12))
        {
        System.out.println("You are a teen");
        }
       
        else
        {
        System.out.println("You are an adult");
        }
        

    }

}


/* Screen Dump

Please enter your age: 
15
You are a teen

 
 */