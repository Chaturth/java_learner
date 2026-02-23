class SumArray{
	public static void main(String[] args)
	{
		int[] number={1,3,4,6,7};
		
		int sum=0;
		
		for(int i=0;i<number.length;i++)
		{
			 sum=sum+number[i];
		}
		System.out.println(sum);
	}
}


class SumArray2 {
    public static void main(String[] args) {

        int[] number1 = {1, 5, 9, 0};
        int[] number2 = {18, 3, 6, 2};

        int[] result = new int[number1.length];

        for (int i = 0; i < number1.length; i++) {
            result[i] = number1[i] + number2[i];
            System.out.print(result[i]+"   ");
        }
    }
}

		

class Largest{
public static void main(String[] args)
{
int[] largeNo={10,20,30,40};
int largest=largeNo[0];
for(int i=0;i< largeNo.length;i++)
{
if(largeNo[i]>largest)

{
	largest=largeNo[i];
}
}
System.out.println(	largest);
}
}		
 
 
 class Large{
	 public static void main(String[] args)
	 {
		 int a=1;
		 int b=2;
		 
		 int largest=a;
		 
		 if(b>largest)
		 {
			 System.out.println(b);
		 }
		 else{
			 System.out.print(a);
		 }
	 }
 }
 
 
class Transpose {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Transpose Matrix:");

        for (int i = 0; i < 3; i++) {          
            for (int j = 0; j < 3; j++) {      
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
		 
		 