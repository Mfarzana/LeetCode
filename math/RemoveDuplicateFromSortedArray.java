/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author Farzana
 */
public class RemoveDuplicateFromSortedArray {
    
    public static int removeDuplicates(int[] nums) {       
        int i=0, j=1; 
        while(j<nums.length){
            if(nums[j]>nums[i]){
                nums[++i]=nums[j];
            }
            j++;
        }
        
        return i+1;
    }
    public static  void main(String args[]){
        /*
        Input: nums = [1,1,2]
        Output: 2, nums = [1,2]: // length 
        Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. 
        It doesn't matter what you leave beyond the returned length.

        Input: nums = [0,0,1,1,1,2,2,3,3,4]
        Output: 5, nums = [0,1,2,3,4]
        */
        System.out.println(removeDuplicates(new int []{1,1,2}));
          System.out.println(removeDuplicates(new int []{0,0,1,1,1,2,2,3,3,4}));
    }
}
