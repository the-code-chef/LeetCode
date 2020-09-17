package MaximumSubarray;

class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        
        // max ending here
        int max = nums[0];
        
        // current max
        int curr_max = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
             curr_max = Math.max(nums[i], curr_max + nums[i]);
            max = Math.max(max, curr_max);
        }
        
        return max;
    }
}