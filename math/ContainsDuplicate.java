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
public class ContainsDuplicate {
    
public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length;i++){
            if(nums[i]==nums[i-1])
                return true;            
        }
        return false;
    }
}