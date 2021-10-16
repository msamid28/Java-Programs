class	Pattern25 
{
	public static void main(String[] args) 
	{
		int row=13;
		int num=1;
		int back=0;
		for(int i=1;i<=row;i++)
		{
			for(int j=num;j>back;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=back;j<=num;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
}
