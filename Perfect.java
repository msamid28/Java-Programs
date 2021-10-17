import java.util.Scanner;
class Perfect 
{

	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Number");
	    int num= sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=num/2)
		{ 
			if(num%i==0)
			{
			sum=sum+i;
			}
			i++;
		}
		if(sum==num)
		{
		System.out.println("It is a Perfect Number");
		}
		else
		{
		System.out.println("It is not a Perfect Number");
		}
	}
}
