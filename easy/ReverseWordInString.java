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

Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
Example 4:

Input: s = "  Bob    Loves  Alice   "
Output: "Alice Loves Bob"
Example 5:

Input: s = "Alice does not even like bob"
Output: "bob like even not does Alice"

*/
public class ReverseWordInString {
            public static  String reverseWords(String s) {

                String[] arr=s.split("\\s+");        //That regular expression simply says: "one or more whitespaces". 
                StringBuilder strBuilder=new StringBuilder();       
                for(int i=arr.length-1; i>=0;--i){
                    strBuilder.append(arr[i]+" ");
                }

                return strBuilder.toString().trim();
            }

       
    public static void main(String args[]){
            String s= "  hello world  ";

        System.out.println(reverseWords(s)+"test");
    }
}
