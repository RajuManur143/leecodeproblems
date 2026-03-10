import java.util.*;

class single_number_in_duplicate {

    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {

            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }

    public static void main(String[] args) {



        int[] nums = {1, 1, 2, 2, 3};


        // Call function
        int result = singleNumber(nums);

        // Output
        System.out.println("Single number is: " + result);
    }
}