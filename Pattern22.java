class Pattern22 
{
	public static void main(String[] args) 
	{
		int row=7;
		int front;
		int middle=0;
		int back=1;
		for(int i=1;i<=row;i++)
		{
			for(front=1;front<=middle;front++)
			{
			System.out.print(front+" ");
			}
			for(int j=middle+1;j>=back;j--)
			{
			System.out.print(j+" ");
			}
		   System.out.println();
	        middle++;

			}
			
		}
	
}
