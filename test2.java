/*
Tyler Smith 
Per. 4 Java
Assignment = test2
*/

import java.io.*;
import java.text.*;
import java.util.Scanner;
public class test2
{
	public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("What is your mid term and final grade?");
			int mid = s.nextInt();
			int fin = s.nextInt();
			first(mid,fin);
				if(first(mid,fin) < 80)
				{
					second(first(mid,fin));
				}
				else 
				{
					third(first(mid,fin));
				}
		}
	public static int first(int mid1,int fin1)
	{
		int total = ((mid1 + (fin1 * 2)) / 3);
		return(total);
	}
	public static void second(int total1)
	{
		Scanner t = new Scanner(System.in);
		System.out.println("What is the name of your advisor?");
		String name = t.next();
		System.out.println("You should consult your advisor, " + name + ", about your major");
	}
	public static void third(int total1)
	{
		System.out.println("You are doing well in your major");
	}
}	
