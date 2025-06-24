import java.util.Scanner;
class Charcom
{
 public static void main(String args[])
 {
	
	Scanner sc=new Scanner(System.in);
	char a=sc.next().charAt(0);
	char b=sc.next().charAt(0);
	System.out.println(a<b);
	System.out.println(a>b);
	System.out.println(a<=b);
	System.out.println(a>=b);
	System.out.println(a==b);
	System.out.println(a!=b);

 }
}