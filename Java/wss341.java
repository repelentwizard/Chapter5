/*
Tyler Smith 
Per. 4 Java
Assignment = wss341
*/

import java.io.*;
import java.text.*;
import java.util.Scanner;
public class wss341
{
	public static void main(String[] args)
		{
	        Scanner s = new Scanner(System.in);  
	                        double lengthOfYard;
	                        double widthOfYard;
	                        double areaOfYard;
				System.out.println("How wide and long is yard");
 	                  widthOfYard = s.nextInt();
                        lengthOfYard = s.nextInt();		
  	     	       areaOfYard = FindArea(lengthOfYard, widthOfYard);								                     System.out.println("Your yard is "  +  areaOfYard  +  " square feet.");
		}
	public static double FindArea(double length, double width)
				              {
						                           return (length * width);
									             }


		}	
