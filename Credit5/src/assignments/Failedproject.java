package assignments;

import java.util.Scanner;

public class Failedproject
{
 public static void main(String args[])
 {
    
	Scanner userinput = new Scanner(System.in);
       System.out.println("How many copies do you want: ");
       double copies = userinput.nextDouble();
       if(copies < 99)
       {
           System.out.println("Price per copy is $0.30");
           System.out.println("Your total cost is " + (copies * 0.30));
       }                    
         else if ((copies < 499)&(copies > 100))
       {
           System.out.println("Price per copy is $0.28" );
           System.out.println("Total cost is: $" + (copies*28)/100 );
       }
        else if ((copies < 749)&&(copies > 500))
       {
           System.out.println("Price per copy is $0.27" );
           System.out.println("Total cost is: $" + (copies*27)/100 );
       }
         else if ((copies < 1000)&&(copies < 750))
       {
           System.out.println("Price per copy is $0.26" );
           System.out.println("Total cost is: $" + (copies*26)/100 );
       }
       else if;
       {
           System.out.println("Price per copy is $0.25" );
           System.out.println("Total cost is: $" + (copies*25)/100 );
       }

       
       
 

}

}

/* Screen Dump
 
How many copies do you want: 
312
Price per copy is $0.28
Total cost is: $87.36


 
 */