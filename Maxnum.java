//Write a program to find maximum between two numbers?//


import java.util.Scanner;
class Maxnum
{
 public static void main(String args[])
{
 	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	if (a<b)
	{
		System.out.println(b+" is Max");
	}
	else
		System.out.println(a+" is Max");
	
}
}