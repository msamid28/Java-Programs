class Pattern17
{
	public static void main(String[] args) 
	{
		int row=7;
		int num=7;
		for(int i=1;i<=row;i++)
		{
			for(int j=num;j>=1;--j)
			{
		    System.out.print(j+" ");
			}
	
		System.out.println();
		    num=num%10;
			num--;
	   }
	}
}
