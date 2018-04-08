/*
Tyler Smith 
Per. 4 Java
Assignment = wss126
*/

import java.io.*;
import java.text.*;
import java.util.Scanner;
public class wss126
{
	public static void main(String[] args)
		{
		Scanner s = new Scanner(System.in);
		Scanner t = new Scanner(System.in);
		System.out.println("Please enter a character and 2 integers");
		String c = s.nextLine();
		char ch = c.charAt(0);
		int one = t.nextInt();
		int two = t.nextInt();
		print(ch,one,two);
		}
	public static void print(char ch1, int one1, int two1)
	{
		int count,count1;
		count = 0;
		count1 = 0;
	while(count1 < two1)
	{
		do 
		{
		System.out.print(ch1);
		count++;
		}
		while(count < one1);
	System.out.println(" ");
	count1++;
	count = 0;
	}

	}

}

