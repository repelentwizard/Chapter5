/*
Tyler Smith 
Per. 4 Java
Assignment = wss125
*/

import java.io.*;
import java.text.*;
import java.util.Scanner;
public class wss125
{
	public static void main(String[] args)
		{
		Scanner s = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println("Please enter 2 integer values");
		x = s.nextInt();
		y = s.nextInt();
		math(x,y);
		}
	public static void math(int x,int y)
	{
	int xs = (x*x);
	int ys = (y*y);
	int fxy = xs + ys;
	System.out.println("These integers squared and summed = " + fxy);
	}

}

