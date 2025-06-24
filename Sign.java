
//Write a Java program to determine the sign of a given number (positive, negative, or zero) using the ternary operator?//

import java.util.Scanner;
class Sign
{
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int a=sc.nextInt();
	String s= (a==0)?"Zero":((a<0)?"Negative":"Positive");
	System.out.println(s);
	
 }
}

