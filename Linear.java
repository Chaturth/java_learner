class Linear{
	
	public static void main(String... args)
	{
		int[] num={3,5,2,4,6};
		int count=0;
		
		int key=2;
		
		for(int i=0;i<=num.length;i++)
		{
			if(num[i]==key)
			{
				System.out.println("KEY  FOUND:"+key);
				break;
			}
			
		}
	}
}
