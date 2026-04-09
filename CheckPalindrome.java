class CheckPalindrome {
    public static void main(String[] args) {
        
        String name = "madam";
        String rev = "";
        
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        
        if (name.equals(rev)) {
            System.out.println("Yes, this is a palindrome: " + rev);
        } else {
            System.out.println("No, this is not a palindrome: " + rev);
        }
    }
}