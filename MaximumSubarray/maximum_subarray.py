class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        # Maximum so far
        maximum = nums[0]
        
        # Maximum ending here
        curr_max = nums[0]
        
        for i in range(1, len(nums)) :
            
            curr_max = max(nums[i], curr_max + nums[i])
            
            maximum = max(curr_max, maximum)
            
        return maximum