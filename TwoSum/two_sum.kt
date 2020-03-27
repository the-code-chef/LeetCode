class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()

        nums.forEachIndexed { i, num ->
            if (target - num in map) {
                return intArrayOf(map[target - num]!!, i)
            }
            map.put(num, i)
        }
        throw IllegalArgumentException("No two sum solution")
    }
}
