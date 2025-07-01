/*
 *  Remove Duplicates from Sorted Array
 * 
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.


Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */

 // LEETCODE LINK : https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

// Time Complexity: O(n)
// Space Complexity: O(1)



class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i=1; i<nums.length;i++){
            if(nums[i] != nums[j-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }


}




    /*

    My Approach
    
    class Solution {
        public int removeDuplicates(int[] nums) {
            int index = 0;
            nums[index] = nums[0];
            index++;
            for (int i=0; i<nums.length -1; i++){
                if(nums[i] < nums[i+1]){
                    nums[index] = nums[i+1];
                    index++;
                }
            }
            return index;
        }
    }
    */