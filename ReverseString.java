class ReverseString{
	
	public static void main(String[] args)
	{
		
		String characters="Hello";
		
		String reversedCharacters=" ";
		
		for(int i=characters.length()-1;i>=0;i--)
		{
			
			reversedCharacters=reversedCharacters+characters.charAt(i);
		}
			System.out.println("result found:"+reversedCharacters);
		
	}
	
}
