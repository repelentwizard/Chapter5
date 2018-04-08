/*
Tyler Smith 
Per. 4 Java
Assignment = wss342
*/

import java.io.*;
import java.text.*;
import java.util.Scanner;
public class wss342
{
	public static void main(String[] args)
		 {
		Scanner s = new Scanner(System.in);
	   	 int num, sumd;
		System.out.println("Please enter a number");
	num = s.nextInt();
	sumd = sum(num);
	System.out.println("The sum of the digits is "  + sumd);
		 }
		 public static int sum(int n)
		 {
			 int ctr;
			 int sd=0;
			 if (n <=0)
				 sd = n;
			 else
			 {
				 for(ctr = 1; ctr <= n; ctr++)
					 sd += ctr;
			 }
			 return (sd);
		 }



		}
	
