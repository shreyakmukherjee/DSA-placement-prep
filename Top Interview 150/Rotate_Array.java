/*
 * Rotate Array
 * 
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.


Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
// LEETCODE LINK : https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k>n){
            k = k%n;
        }

        reverse(nums ,0, n-1);
        reverse(nums, 0 , k-1);
        reverse(nums, k, n-1);
    }
    public void reverse(int [] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
    }
}