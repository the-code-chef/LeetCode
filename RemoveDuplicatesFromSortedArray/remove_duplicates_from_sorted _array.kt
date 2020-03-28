class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size == 0) return 0
        var j = 0
        for (i in 1 until nums.size) {
            if (nums[i] != nums[j]) {
                j++
                nums[j] = nums[i]
            }
        }
        return j + 1
    }
}
