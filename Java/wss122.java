/*
Tyler Smith 
Per. 4 Java
Assignment = wss122
*/

import java.io.*;
import java.text.*;
import java.util.Scanner;
public class wss122
{
	public static void main(String[] args)
		{
			int x = 5;
			int y = 10;
			System.out.println("Main. Before swap, x: " + x + " and y: " + y);
			swap(x,y);
			System.out.println("Main. After swap, x: " + x + " and y: " + y);
		}
	//method definition
	public static void swap(int x,int y)
	{
		int temp;
		System.out.println("Swap. Before swap,x: " + x + " and y: " + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("Swap. After swap,x: " + x + " and y: " + y);
	}
}	
