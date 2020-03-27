/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
let twoSum = function(nums, target) {
    let res = {};
    
    let num;
    for (let i = 0; i < nums.length; i++) {
        num = nums[i]
        if (target - num in res) {
            return [res[target - num], i]
        }
        res[num] = i
    }
};

