class leetcode3 {
   public static void main(String args[]) {

        int candies[] = {2, 3, 5, 1, 3};
        int extraCandies = 3;

      
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
   }
}