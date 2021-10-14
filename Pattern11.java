class Pattern11
{
	public static void main(String[] args) 
	{
		int row=7;
		int str=1;
		int spc=3;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=spc;j++)
			{
			System.out.print("  ");
			}
			for(int j=1;j<=str;j++)
			{
			System.out.print("* ");

			}
			System.out.println();
			if(i<=row/2){
			spc--;
			str++;
			str++;
			}
			else
			{
			spc++;
			str--;
			str--;
			}
		}
	}
}

