package RotateArray;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        if(k == 0) {
            return;
        }
        
        int n = nums.length;
        
        k = k % n;
        
        
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            swap(nums, start++, end--);
        }
    }
    
    private void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
