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
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
*/
public class ReverseInteger {
    public int reverse(int x) {               
        long rev = 0;
        while(x!=0){
            rev=rev*10+x%10;
            x=x/10;
        }
        // 32-bit signed integer range: [−231,  231 − 1].
        // Checking 
        //your function returns 0 when the reversed integer overflows.
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
            return 0;
        
         else return (int) rev;
    }
}
