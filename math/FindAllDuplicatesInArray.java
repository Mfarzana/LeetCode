/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Farzana
 */
public class FindAllDuplicatesInArray {
    
 public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) list.add(nums[i]);
        }
        
        return list;
    }
}