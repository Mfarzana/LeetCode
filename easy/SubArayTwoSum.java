/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

import leetcode.*;
import java.util.HashMap;

/**
 *
 * @author Farzana
 */
// https://leetcode.com/problems/two-sum/submissions/
// https://leetcode.com/problems/two-sum/
/*
Given an array of integers nums and and integer target, return the indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1]
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/
class SubArayTwoSum {
    public int[] twoSum(int[] nums, int target) {
        if(nums==null || nums.length==0) return null;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sub=target-nums[i];
            
            if(map.containsKey(sub)){
                return new int []{i,map.get(sub)};
            }
            
            map.put(nums[i],i);
        }
        return null;
    }
}

