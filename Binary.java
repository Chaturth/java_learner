class Binary{
	
	public static void main(String... args)
	{
		int num[]={1,2,3,4,5};
		int key=2;
		int left=0;
		int right=num.length-1;
		int mid;
		
		{
			while(left<=right)
			{
				mid=(left+right)/2;
				
				if(num[mid]==key)
				{
					System.out.println("key found:"+key);
					return;
				}
				else if(num[mid]<key)
				{
					
					left=mid+1;
				}
				else{
					right=mid-1;
				}
			}
			System.out.println("Key not found");
		}
	}
}
