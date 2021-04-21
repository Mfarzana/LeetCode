/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.tree;

import java.util.Stack;

/**
 *
 * @author Farzana
 */
public class FlattenBinaryTreeToLinkedList {
    
 public void flatten(TreeNode root) {
        if(root==null)
            return;
        
        TreeNode curr=root;
        TreeNode pre=null;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(curr);
        
        while(!stack.isEmpty()){      
            curr=stack.pop();
            
            if(pre!=null)
                pre.right=curr;
                
            if(curr.right!=null)
                stack.push(curr.right);
            if(curr.left!=null)
                stack.push(curr.left);
          
            curr.left=null;
            pre=curr;
                
        }
      
        
    }
    
   class TreeNode {
               int val;
               TreeNode left;
               TreeNode right;
               TreeNode() {}
               TreeNode(int val) { this.val = val; }
               TreeNode(int val, TreeNode left, TreeNode right) {
                   this.val = val;
                   this.left = left;
                   this.right = right;
               }
           }
}
