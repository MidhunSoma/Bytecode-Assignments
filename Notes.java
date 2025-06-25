//Write a program to count total number of notes in given amount?//

import java.util.Scanner;
class Notes
{
 public static void main(String args[])
 {
 	Scanner sc=new Scanner(System.in);
	System.out.println("Enter amount: ");
	int amount=sc.nextInt();
	int fh=amount/500;
	int rem=amount%500;
	int th=rem/200;
	rem%=200;
	int h=rem/100;
	rem%=100;
	int fif=rem/50;
	rem%=50;
	int tw=rem/20;
	rem%=20;
	int ten=rem/10;
	rem%=10;
	System.out.println(fh+"-Five Hundreds "+th+"-Two Hundreds "+h+"-Hundreds "+fif+"-Fifties "+tw+"-Twenties "+ten+"-Tens");
	
	
	
	
 }
}

