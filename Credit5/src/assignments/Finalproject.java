


package assignments;


import java.util.Scanner;

public class Finalproject


{
	public static void main ( String[] args )
	
	{
		
  double weight, weightjupiter, weightmars, weightmercury, weightneptune, weightpluto, weightSaturn, weightUranus, weightVenus;
  String planet;
  
  Scanner scan = new Scanner( System.in );
  
  System.out.println("Enter your weight");
  
  weight = scan.nextInt();
  
  System.out.println("Which planet would you like to travel to: ");
  
  planet = scan.next(); 
  
  if (planet.equalsIgnoreCase("Jupiter"))
	  
  {
  weightjupiter = weight * 2.65;
  System.out.println( "Your weight on Jupiter is: " + weightjupiter);
  
  } 
  
  else if (planet.equalsIgnoreCase("Mars"))
  
  {
  weightmars = weight * 0.375;
  System.out.println( "Your weight on Mars is: " + weightmars);
  
  } 
  
  else if (planet.equalsIgnoreCase("Mercury"))
  
  {
  weightmercury = weight * 0.3;
  System.out.println ("Your weigth on on Mercury is: " + weightmercury);
  
  }

  else if (planet.equalsIgnoreCase("Neptune"))
  
  {
  weightneptune = weight * 1.1;
  System.out.println ("Your weigth on on Neptune is: " + weightneptune);
  
  } 
  
  else if (planet.equalsIgnoreCase("Pluto"))
  
  {
  weightpluto = weight * 0.7;
  System.out.println ("Your weigth on on Pluto is: " + weightpluto);
  
  } 
  
  else if (planet.equalsIgnoreCase("Saturn"))
  
  {
  weightSaturn = weight * 1.2;
  System.out.println ("Your weigth on on Saturn is: " + weightSaturn);
  
  } 
  
  else if (planet.equalsIgnoreCase("Uranus"))
  
  {
  weightUranus = weight * 0.9;
  System.out.println ("Your weigth on on Uranus is: " + weightUranus);
  
  } 
  
  else if (planet.equalsIgnoreCase("Venus"))
  
  {
  weightVenus = weight * 0.875;
  System.out.println ("Your weigth on on Venus is: " + weightVenus);
  
  }
}
}





/* Screen Dump

Enter your weight
155
Which planet would you like to travel to: 
Jupiter
Your weight on Jupiter is: 410.75

 
 */