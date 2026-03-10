import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int option1 = nums[n-1] * nums[n-2] * nums[n-3];
        int option2 = nums[0] * nums[1] * nums[n-1];

        return Math.max(option1, option2);
    }

        public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {1, 2, 3, 4};

        int result = sol.maximumProduct(nums);

        System.out.println("Product is = " + result);
        
    }
}


