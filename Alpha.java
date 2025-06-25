//Write a program to check whether a character is alphabet or not?//

import java.util.Scanner;
class Alpha
{
 public static void main(String args[])
{
 	Scanner sc=new Scanner(System.in);
	char a=sc.next().charAt(0);
	if (Character.isLetter(a))
	{
        	System.out.println(a+" is Alphabet");
	}
	else
		System.out.println(a+" is not an Alphabet");
		
}
}