//Write a program to check whether a number is divisible by 5 and 11 or not?//

import java.util.Scanner;
class Divisible
{
 public static void main(String args[])
{
 	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if (a%5==0 && a%11==0)
	{
		System.out.println(a+" is Divisible by 5 and 11");
	}
	else if (a%5==0 && a%11!=0)
	{
		System.out.println(a+" is Divisible by 5 only");
	}
	else if (a%11==0 && a%15!=0)
	{
		System.out.println(a+" is Divisible by 11 only");
	}
	else
		System.out.println(a+" is not Divisible by 5 and 11");
	
}
}