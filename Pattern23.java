class Pattern23 
{
	public static void main(String[] args) 
	{
		int row=13;
		int num=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=2;j<=num;j++)
			{
				System.out.print("  ");
			}
			for(int j=num;j<=7;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			if(i<=row/2)
			{
			num++;
			}
			else
			{
			num--;
			}
			}
			
		}
	}


