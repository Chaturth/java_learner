class TwoSums{
	
	public static void main(String... args){
		
	int nums[] = { 1,3,4,6,7} ;
	int target = 10;
	
	for(int i=0; i<nums.length-1;i++)
	{
		for(int j=i+1;j<nums.length-1;j++)
		{
			if(nums[i]+nums[j]==target)
			{
				System.out.println("Solution found");
				System.out.println("idexes are:"+i +' ' + j);
				System.out.println("values are:"+nums[i] +' ' + nums[j]);
					System.out.println("Target found:"+target);
					return;
			}
		}
	}
	
    	System.out.println("System not found");
	
	}
	
}