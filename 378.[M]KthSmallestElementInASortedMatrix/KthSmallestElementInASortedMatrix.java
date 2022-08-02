/*
 * @lc app=leetcode id=378 lang=java
 *
 * [378] Kth Smallest Element in a Sorted Matrix
 */

// @lc code=start
class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length; // rows
        int n = matrix[0].length; // columns

        int left = matrix[0][0]; // 1st element
        int right = matrix[m - 1][n - 1]; // last element

        while (left < right) {
            int mid = left + (right - left) / 2; // mid element
            int count = 0; // number of elements <= mid
            for (int i = 0; i < m; i++) { // iterate through the matrix
                int j = 0;  // start from the leftmost column
                while (j < n && matrix[i][j] <= mid) {  // find the number of elements <= mid
                    j++; // increment j
                }  // j is the number of elements <= mid
                count += j; // add the number of elements <= mid to count
            }  // count is the number of elements <= mid
            if (count < k) {  // if count < k, then mid is too small
                left = mid + 1; // set left to mid + 1
            } else { // if count >= k, then mid is too big
                right = mid; // set right to mid
            } // mid is the rightmost element <= mid
        } // left is the rightmost element <= mid

        return left; // left is the rightmost element <= mid
    }
}
// @lc code=end
