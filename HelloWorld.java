class HelloWorld{
	public static void main(String[] things){
		System.out.println("HELLO WORLD");
	
	
	int add1=10;
	
	int add2=20;
	
	System.out.println("Addition:");
	System.out.println(add1+add2);
	
	int num1=55;
	
	int num2=44;
	
	System.out.println("BEFORE SWAP: num1:"+num1+" num2:"+num2);
	
	int variable=num1;
	num1=num2;
	num2=variable;
	
	System.out.println("After SWAP:num1:"+num1+" num2:"+num2);
	
	int number=44;
	
	String binary=Integer.toBinaryString(number);
	
	System.out.println("number:"+number);
	
	System.out.println("binary:"+binary);
	
	int factorialNumber=6;
	
	int start=1;
	
	for(int i=1;i<=factorialNumber;i++)
	{
		start=start*i;
	}
	System.out.println("Factorial of number :"+factorialNumber+" is: "+start);
	
	}
}

	
	
