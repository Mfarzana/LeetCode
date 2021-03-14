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
/*
Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
*/
public class InvertBinaryTree {
    
      /// ..............................Using DFS...................................
 public TreeNode invertTree(TreeNode root) {      
        if(root==null) return null;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            if(node!=null){
                TreeNode temp=node.left;
                node.left=node.right;
                node.right=temp;
                stack.push(node.left);
                stack.push(node.right);
            }
            
        }
       return root;                 
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