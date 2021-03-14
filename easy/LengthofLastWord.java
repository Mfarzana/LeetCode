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
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");           
        return str.length==0?0:str[str.length-1].length();
        
    }
}
