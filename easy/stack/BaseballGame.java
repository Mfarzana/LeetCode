/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.stack;

import java.util.Stack;

/**
 *
 * @author Farzana
 */
public class BaseballGame {
    
public int calPoints(String[] ops) {        
        Stack<Integer> stack=new Stack<>();
       
        for(String s: ops){          
            
            if(s.equals("+")){
                  stack.push(stack.peek()+stack.elementAt(stack.size()-2));
            }
            else if(s.equals("C")){
               stack.pop();
            }
            else if(s.equals("D")){
               stack.push(stack.peek()*2);
                   
            }
            else{             
                stack.push(Integer.parseInt(s));
            }   
            
        }
        
       // System.out.print(" stack "+stack);
        
        return stack.stream().mapToInt(Integer:: intValue).sum();
        
    }
}