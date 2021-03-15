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
public class RotateString {
    
public boolean rotateString(String A, String B) {
        if(A==null || B==null) return false;
        if(A.length()==0 && B.length()==0) return true;
        
        StringBuilder builder=new StringBuilder(A);
        for(int i=0;i<A.length(); i++){
            builder.append(A.charAt(i));
            builder.deleteCharAt(0);
            if(builder.toString().equals(B)) 
                return true;
        }
        
        return false;
    }
}