import java.lang.Math;
import java.util.Scanner;
class Remainder // without using % operator
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First Number");
	double num1= sc.nextDouble();
	System.out.println("Enter the Second Number");
	double num2= sc.nextDouble();
	System.out.println(Math.IEEEremainder(num1,num2));


}
}