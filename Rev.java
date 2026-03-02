//Reverse "engineer"

class Rev{
	
	public static void main(String... args)
	{
		String letter="engineer";
		String output=" ";
		
		for(int i=letter.length()-1;i>0;i--)
		{
			output=output+letter.charAt(i);
		}
		System.out.println("output:"+output);
	}
}


//"racecar"

class pali{
	public static void main(String... args)
	{
		String name="mam";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev))
		{
			System.out.println("palindrome");
		}
		
		else 
		{
			System.out.println("not palindrome");
		
		}
	}
}

//vowels

class Vowel {
    public static void main(String[] args)
    {
        String word = "education";
        int count = 0;

        for(int i = 0; i < word.length(); i++)
        {
            char character = word.charAt(i);

            if(character == 'a' || character == 'e' ||
               character == 'i' || character == 'o' ||
               character == 'u')
            {
                count++;
            }
        }

        System.out.println("Vowels: " + count);
    }
}


class RemoveSpaces {
    public static void main(String[] args) {
        String s = "hello world java";
        String result = "";

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                result = result + s.charAt(i);
            }
        }

        System.out.println("Without spaces: " + result);
    }
}
				
