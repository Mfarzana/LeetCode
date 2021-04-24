/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import java.util.Arrays;

/**
 *
 * @author Farzana
 */
public class SingleNumberDuplicateFind {
    
  public int singleNumber(int[] nums) {
        
        Arrays.sort(nums);
        int val=nums[0];
        int count=1;
        
        for(int i=1;i<nums.length;i++){
            if(val!=nums[i]){
                if(count==1) return val;
                val=nums[i];
                count=1;
            }
            else
                count++;
        }
        return val;
    }
}