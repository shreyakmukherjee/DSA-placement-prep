/*
 * Jump Game
 * 
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */

 
// LEETCODE LINK : https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean canJump(int[] nums) { 
        int n = nums.length;
        int goal = n-1;
        for(int i=n-2;i>=0;i--){
            if(i+nums[i] >= goal){
                goal = i;
            }
        }
        if(goal == 0){
            return true;
        }
        return false;   
    }
}