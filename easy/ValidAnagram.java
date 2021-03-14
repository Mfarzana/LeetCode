/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

import java.util.Arrays;

/**
 *
 * @author Farzana
 */
/*
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
*/
public class ValidAnagram {
    
 public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] schar=s.toCharArray();
        char[] tchar=t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);       
        for(int i=0;i<schar.length;i++){
           if(schar[i]!=tchar[i]) return false;        
        }
        
        return true;
    }
}
