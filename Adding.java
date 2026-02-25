class Adding{
	
	public static void main(String[] args)
	{
		int[] shirts={1,5,7,9};
		
		int result=0;
		
		for(int i=0;i<shirts.length;i++)
		{
			result=result+shirts[i];
		}
			
			
			System.out.println("result:"+result);
		
	}
}


class Average{
	
	public static void main(String[] args)
	{
		int[] plates={2,4,6,8,2};
		int sum=0;
		int average=0;
		
		for(int i=0;i<plates.length;i++)
		{
			sum=sum+plates[i];
		}
		
		average=sum/plates.length;
		
		System.out.println("average:"+average);
	}
}

		
class Largee {
    public static void main(String[] args) {
        int[] cups = {2, 4, 6, 8, 2};
        int large = cups[0]; // start with first element

        for (int i = 1; i < cups.length; i++) {
            if (cups[i] > large) {
                large = cups[i];
            }
        }

        System.out.println("Largest: " + large);
    }
}

class Small {
    public static void main(String[] args) {
        int[] cup = {2, 4, 6, 8, 2};
        int small = cup[0]; // start with first element

        for (int i = 1; i < cup.length; i++) {
            if (cup[i] < small) {
                small = cup[i];
            }
        }

        System.out.println("Smallest: " + small);
    }
}

class Even{
	public static void main(String[] args)
	{
		int[] bed={2,4,6,8,7,5,3};
		int count=0;
		
		for(int i=0;i<bed.length;i++)
		{
			if(bed[i]%2==0)
			{
				count=count+1;
			}
			
		}
		System.out.println("count:"+count);
	}
}


class Odd{
	public static void main(String[] args)
	{
		int[] bed={2,4,6,8,7,5,3};
		int count=0;
		
		for(int i=0;i<bed.length;i++)
		{
			if(bed[i]%2!=0)
			{
				count=count+1;
			}
			
		}
		System.out.println("count:"+count);
	}
}

class Reverse {
    public static void main(String[] args) {
        int[] mobile = {1, 2, 3, 4};

       
        for (int i = mobile.length - 1; i >= 0; i--) {
            System.out.println(mobile[i]);
        }
    }
}


class Search{
	public static void main(String[] args)
	{
		int[] name={20,5,30,40};
		
		int target=5;
		
		boolean found=false;
		
		for(int i=0;i<name.length;i++)
		{
			if(target==name[i])
			{
				 System.out.println(target);
				 found=true;
				 break;
			}
			
		}
		 if (!found) {
            System.out.println("Element " + target + " not found in array.");
        }
    }
}

class Occur{
	public static void main(String[] args)
	{
		int[] kyte={5,7,9,3,2,2,4,3};
		int count=0;
		int search=3;
		
		for(int i=0; i<kyte.length;i++)
		{
			if(search==kyte[i])
			{
				count++;
			}
		}
		System.out.println("search:"+search +"count:"+count);
	}
}



class  SecondLargee {
    public static void main(String[] args) {
        int[] cups = {2, 4, 6, 8, 2};
        int large = cups[0];
		int secondlarge=cups[0];

        for (int i = 1; i < cups.length; i++) {
            if (cups[i] > large) {
                
				secondlarge=large;
				large=cups[i];
            }
        }

         else if (cups[i] > secondLarge && cups[i] != large) {
                secondLarge = cups[i];  
		 }
        }

        System.out.println("Second Largest = " + secondLarge);
    }
}


