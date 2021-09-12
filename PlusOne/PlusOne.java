/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if(digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        
        if(digits[0] == 0) {
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1;
            return newDigits;
        } else {
            return digits;
        }
    }
}
// @lc code=end

