/*
Tyler Smith 
Per. 4 Java
Assignment = wss123
*/

import java.io.*;
import java.text.*;
import java.util.Scanner;
public class wss123
{
	public static void main(String[] args)
		{
		Scanner s = new Scanner(System.in);
		reader.useDelimiter("");
		int times;
		String ch;

		System.out.println("Enter a character.");
		ch = s.nextLine();
		char c = reader.s().charAt(0);
		while(ch != 'q') //q to quit
		{
			times = Console.readInt("Enter an integer:");
			n_chars(ch,times);//method call
			System.out.println("Enter another character or press q to quit:");
			Stromg ch2 = s.nextLine();
			char ch1 = reader.s().charAt(0);
			System.out.println("The value of times is " + times + ".");
			System.out.println("Bye.");
		}
		}		//Method definition
		public static void n_chars(char c,int n)//displays c n times
		{
			while(n-- > 0)
				System.out.println(c);
		}
}	
