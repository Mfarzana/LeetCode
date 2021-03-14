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
public class LongestCommonPrefix {  

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        if (strs.length==1) return strs[0];
        
        String matchStr=strs[0];
       
        for(int i=1;i<strs.length;i++){
             String pre="";             
            int minStrLen = Math.min(matchStr.length(),strs[i].length());          

            for(int j=0;j<minStrLen;j++){                
                if(matchStr.charAt(j)==strs[i].charAt(j))
                    pre+=""+strs[i].charAt(j);
                else 
                    break; 
            }            
                       
            matchStr=pre;            
        }
        
        return matchStr;
    }
}