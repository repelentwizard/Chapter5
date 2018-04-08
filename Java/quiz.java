/*
Tyler Smith 
Per. 4 Java
Assignment = quiz
*/

import java.io.*;
import java.text.*;
import java.util.Scanner;
public class quiz 
{
	public static void main(String[] args)
		{
		Scanner s = new Scanner (System.in);
		System.out.println("What are the dimensions of the rectangle");
		int l = s.nextInt();
		int w = s.nextInt();
		ast();
		per(l,w);
		System.out.println("The perimeter is " + per(l,w));
		ast();
		}

	public static void ast()
	{
		for(int count = 0;count <= 75; count++)
		{
			System.out.print("*");
		}
	}
	public static int per(int l1,int w1)
	{
	int perm = (l1 + l1 + w1 + w1);
	return(perm);
	}
}

