//Write a program to check whether a character is uppercase or lowercase alphabet?//

import java.util.Scanner;
class Upperlower
{
 public static void main(String args[])
{
 	Scanner sc=new Scanner(System.in);
	char a=sc.next().charAt(0);
	if (Character.isLowerCase(a))
	{
		System.out.println("Lowercase");
	}
	else
		System.out.println("Uppercase");
}
}