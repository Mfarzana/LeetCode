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
Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 
*/
public class AddBinary {
    
    public String addBinary(String a, String b) {
    
        String bin="";
        int alen=a.length()-1;
        int blen=b.length()-1;
        int carry=0;
       
        while(alen>=0 || blen>=0){
            int val2=0;
            int val1=0;
            try{
                if(alen>=0) val1= Character.getNumericValue(a.charAt(alen));             
                
                if(blen>=0) val2=Character.getNumericValue(b.charAt(blen));
                
                int sum=(val1+val2+carry)%2;
                bin=""+sum+bin;
                carry=(val1+val2+carry)/2;
                                

            }catch (Exception e){System.out.println(e);}
            
            alen--;
            blen--;
        }       
        
        //System.out.println(carry);

        if(carry==1) bin="1"+bin;
        
        return bin;
    }
}