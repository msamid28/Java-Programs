class Pattern24 
{
	public static void main(String[] args) 
	{
		int row=13;
		int start=1;
		int num=7;
		int spc=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=spc;j++)
			{
			  System.out.print(" ");
			}
			for(int j=start;j<=num;j++)
			{
	        	System.out.print(j+" ");
			}
			System.out.println();
			if(i<=row/2)
			{
			spc++;
			start++;
			}
			else
			{
			spc--;
			start--;
			}
		}
	}
}
