//Write a program to check whether a number is even or odd?//

import java.util.Scanner;
class Evenodd
{
 public static void main(String args[])
{
 	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if (a%2==0)
	{
		System.out.println(a+" is Even");
	}
	else
		System.out.println(a+" is Odd");
	
}
}