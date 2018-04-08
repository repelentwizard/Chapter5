/*
Tyler Smith 
Per. 4 Java
Assignment = pm123
*/

import java.io.*;
import java.text.*;
import java.util.Scanner;
public class pm123
{
	public static void main(String[] args)
		{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter mid-year average in Java");
		int extension = s.nextInt();
		if(extension >= 65){
		greater();
		}
		else{
			less();
		}
		}
	public static void greater()
	{
		System.out.println("You are passing");
	}
	public static void less()
	{
		System.out.println("Hook up with a smart classmate and study");
	}
}	
