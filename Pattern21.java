class Pattern21 
{
	public static void main(String[] args) 
	{
		int row=7;
		int num;
		int back=7;
		for(int i=1;i<=row;i++)
		{
			for(num=1;num<=back;num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
			back--;
		}
	}
}
