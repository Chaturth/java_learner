class Second{
	
	public static void main(String[] args)
	{
		int[] num={1,2,3,4,5};
		int large=num[0];
		int second=0;
		
		int i=0;
		
		while(i<num.length)
		{
			
			if(num[i]>large)
			{
				second=large;
				large=num[i];
				
			}
			else if(num[i]>second && num[i]!=large)
			{
				second=num[i];
			}
			i++;
		}
		  System.out.println("Second largest element: " + second);
	}
}