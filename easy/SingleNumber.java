/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

import java.util.ArrayList;

/**
 *
 * @author Farzana
 */
/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
*/
public class SingleNumber {
    public int Solution1(int[] nums) {
        //Using Extra memory
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums){
            if(!list.contains(i))
                list.add(i);
            else
                list.remove(new Integer(i));
        }
        
        return list.get(0);       
    }

    public int Solution2(int[] nums) {       
        //Using bitwise xor
        int xor=0;
        for(int i:nums){
            xor=xor^i;       
        }
        
        return xor;
    }
}