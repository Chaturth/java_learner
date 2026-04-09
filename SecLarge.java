public class SecLarge {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        int large = nums[0];
        int secondlarge = Integer.MIN_VALUE;

        int i = 0;

        while (i < nums.length) {
            if (nums[i] > large) {
                secondlarge = large;
                large = nums[i];
            } else if (nums[i] > secondlarge && nums[i] != large) {
                secondlarge = nums[i];
            }
            i++; 
        }

        System.out.println("Second largest element: " + secondlarge);
    }
}