class Solution:
    def twoSum(self, nums, target):
        res = {}
        
        for i, num in enumerate(nums):
            if target - num in res:
                return [res[target - num], i]
            res[num] = i
