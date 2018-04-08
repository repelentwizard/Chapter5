/*
Tyler Smith 
Per. 4 Java
Assignment = pm122
*/

import java.io.*;
import java.text.*;
import java.util.Scanner;
public class pm122
{
	public static void main(String[] args)
		{
		first();
		second();
		first();
		}
	public static void first()
	{
		int count = 0;
		while(count <= 30)
		{
			System.out.print("$");
			count++;
		}
		System.out.println(" ");
	}
	public static void second()
	{
		System.out.println("Mr. Extension");
		System.out.println("123 Exntenion Dr.");
		System.out.println("Extension Aurora, Illinois 43759");

	}


}	
