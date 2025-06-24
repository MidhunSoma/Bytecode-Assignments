/* Write a Java program that takes five numbers as input to calculate and print the average of the numbers*/

import java.util.Scanner;
class Avg
{
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	float sum=0;
	for(int i=1;i<=5;i++){
		sum+=sc.nextFloat();
	}
	float avg=sum/5;
	System.out.println("Average: "+avg);
 }
 
}



