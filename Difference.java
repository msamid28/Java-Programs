import java.lang.Math;
import java.util.Scanner;
class Difference //without using - operator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First Number");
	int num1= sc.nextInt();
	System.out.println("Enter the Second Number");
	int num2= sc.nextInt();
	System.out.println(Math.subtractExact(num1,num2));
	}
}
