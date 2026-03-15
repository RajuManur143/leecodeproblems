class Solution {
    public int maximu_positive_negative_count(int[] nums) {

        int negativeCount = 0;
        int positiveCount = 0;

        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] < 0 && nums[i]!= 0 ) {
                negativeCount ++;
            }
            else if(nums[i] > 0 && nums[i] != 0){
                positiveCount++;
            }
        }
        if (positiveCount > negativeCount) {
            return positiveCount;
        }
        else{
            return negativeCount;
        }
        
    }
}