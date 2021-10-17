class Neon
{
	public static void main(String[] args) 
	{
		int num=8,sum=0;
		int sqr=num*num;
		while(sqr!=0)
		{
			int d=sqr%10;
			sum=sum+d;
			sqr=sqr/10;
		}
		if (num==sum)
		{
		System.out.println("It is a neon Number");
		}
		else
		{
			System.out.println("Not a neon Number");
		}
		
	}
}
