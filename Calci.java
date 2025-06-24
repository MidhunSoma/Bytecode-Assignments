/* Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers*/

import java.util.Scanner;
class Calci
{
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	float a=sc.nextFloat();
	float b=sc.nextFloat();
	System.out.println("SUM: "+(a+b));
	System.out.println("MULTIPLY: "+(a*b));
	System.out.println("SUBTRACT: "+(a-b));
	System.out.println("DIVISION: "+(a/b));
	System.out.println("REMAINDER: "+(a%b));
 
 }
}