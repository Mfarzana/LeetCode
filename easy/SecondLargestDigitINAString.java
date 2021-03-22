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
public class SecondLargestDigitINAString {
    /*
    
    Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.

An alphanumeric string is a string consisting of lowercase English letters and digits.

 

Example 1:

Input: s = "dfa12321afd"
Output: 2
Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
Example 2:

Input: s = "abc1111"
Output: -1
Explanation: The digits that appear in s are [1]. There is no second largest digit. 
    */
public int secondHighest(String s) {
        
        int min=-1;
        int max=-1;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                int val=Character.getNumericValue(c);
                if(val>max){
                    min=max;
                    max=val;
                }else if(val!=max && val>min)
                    min=val;
            }
        }
        return min;
    }
}
