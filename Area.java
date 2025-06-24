// Write a Java program to calculate the area of a circle given its radius? //

import java.util.Scanner;
class Area
{
 public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	float r=sc.nextFloat();
	double area=3.14*r*r;
	System.out.println(area);
}
}