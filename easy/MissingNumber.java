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
public class MissingNumber {
    
public int missingNumber(int[] nums) {
        int n=nums.length;
        int total=(n*(n+1))/2; //  formulas for total sum 1+2+3...............................+100
        int sum=0; // sum all arrays value
        for(int i:nums){
            sum+=i;
        }
        
        return total-sum;
    }
}