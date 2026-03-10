class Findmax {
    public static void main(String... args) {
        int[] student = {1, 2, 3, 4, 5};
        int max = student[0];  

        for (int i = 1; i < student.length; i++) {
            if (student[i] > max) {
                max = student[i];
            }
        }

        System.out.println("Maximum value: " + max);
    }
}
			
class find{
	public static void main(String... args)
	{
		int[] num={6,7,8,9};
		int res=num[0];
		for( int value:num)
		{
			if(value>res)
			{
				res=value;
			}
		}
		System.out.println(res);
	}
}

class SecondLarge {
    public static void main(String... args) {
        int[] num = {1, 2, 3, 4, 5};
        int max1, max2;

        // Initialize first two values
        if (num[0] > num[1]) {
            max1 = num[0];
            max2 = num[1];
        } else {
            max1 = num[1];
            max2 = num[0];
        }

        // Check the rest of the array
        for (int i = 2; i < num.length; i++) {
            if (num[i] > max1) {
                max2 = max1;
                max1 = num[i];
            } else if (num[i] > max2) {
                max2 = num[i];
            }
        }

        System.out.println("Second largest: " + max2);
    }
}

		
	
