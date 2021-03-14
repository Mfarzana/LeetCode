/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

import java.util.Stack;

/**
 *
 * @author Farzana
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        if(s.length()==0 || s==null) return false;
        
        Stack<Character> stack =new Stack();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if(stack.isEmpty()) return false;
            else{
                    char curr= stack.pop();
                         
                    if(c==')' && curr!='(')
                        return false;
                    else if(c=='}' && curr!='{')
                        return false;
                    else if(c==']' && curr!='[')
                        return false;
                                    
            }
            
        }
        
       return stack.empty();
        
    }
}