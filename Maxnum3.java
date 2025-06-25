//Write a program to find maximum between three numbers?//

import java.util.Scanner;
class Maxnum3
{
 public static void main(String args[])
{
 	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if (a>b)
	{
		if (a>c)
		{
			System.out.println(a+" is Max");
		}
		else
		{
			System.out.println(c+" is Max");
		}
		
	}
	else if(b>c)
		System.out.println(b+" is Max");
	
}
}