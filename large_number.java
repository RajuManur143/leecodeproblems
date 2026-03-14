import java.util.*;

class large_number {
    public String largestNumber(int[] nums) {
        
        // Step 1: Convert int array to String array
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        
        // Step 2: Custom sort
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        
        // Step 3: Edge case (all zeros)
        if (arr[0].equals("0")) {
            return "0";
        }
        
        // Step 4: Build result
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }
        
        return result.toString();
    }
}