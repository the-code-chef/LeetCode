/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    // Maximum so far
    let maximum = nums[0]

    // Maximum ending here
    let curr_max = nums[0]

    for (let index = 1; index < nums.length; index++) {
        curr_max = Math.max(nums[index], curr_max + nums[index]);
        
        maximum = Math.max(curr_max, maximum);
    }

    return maximum;

};