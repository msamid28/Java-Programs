import java.lang.Math;
import java.util.Scanner;
class Sum //without using + operator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First Number");
	int num1= sc.nextInt();
	System.out.println("Enter the Second Number");
	int num2= sc.nextInt();
	System.out.println(Math.addExact(num1,num2));
	}
}
