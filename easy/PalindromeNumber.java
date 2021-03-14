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
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
*/
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp=x;
        int reminder=0;
        while(temp!=0){
            reminder=reminder*10+temp%10;
            temp=temp/10;
        }

        if(x==reminder) 
            return true;
        else 
            return false;
        
    }
}
