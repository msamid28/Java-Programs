import java.lang.Math;
import java.util.Scanner;
class OddEven // without using % operator
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	double num1= sc.nextDouble();
	if(Math.IEEEremainder(num1,2)==0)
	{
		System.out.println("It is even Number");
	}
	else
	{
		System.out.println("Its is odd Number");
	}
}
}