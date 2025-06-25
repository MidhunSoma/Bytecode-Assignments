//Write a program to check whether a number is negative, positive or zero?//

import java.util.Scanner;
class Sign
{
 public static void main(String args[])
{
 	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if (a!=0)
	{
		if (a>0)
		{
			System.out.println(a+" is Positive");
		}
		else
		{
			System.out.println(a+" is Negative");
		}
		
	}
	else
		System.out.println(a+" is Zero");
	
}
}
