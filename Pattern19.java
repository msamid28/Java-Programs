class Pattern19 
{
	public static void main(String[] args) 
	{
		int row=7;
		int back=1;
		int num;
		for(int i=1;i<=row;i++)
		{
			for(num=7;num>=back;num--)
			{
				System.out.print(num+" ");
			}
			System.out.println();
			back++;
		}
	}
}
