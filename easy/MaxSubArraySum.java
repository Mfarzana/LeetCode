/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

/**
 *
 * @author Farzana
 */
/*
ven an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [0]
Output: 0
Example 4:

Input: nums = [-1]
Output: -1
Example 5:

Input: nums = [-2147483647]
Output: -2147483647
*/
public class MaxSubArraySum {
    
public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        
        int max=nums[0];
        int currMax=nums[0];;
        for(int i=1;i<nums.length;i++){
            currMax=Math.max(nums[i],currMax+nums[i]);
            max=Math.max(max,currMax);
          
        }
        return max;
        
    }
}