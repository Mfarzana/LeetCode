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
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
*/
public class BinaryTreePathSum {
    public class TreeNode {
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
    public boolean hasPathSum_RecursiveSolution(TreeNode root, int sum) {
    
        if(root==null) return false;
        if(root.left==null && root.right==null)
            return root.val==sum;        
        
        return hasPathSum_RecursiveSolution(root.left,sum-root.val)||hasPathSum_RecursiveSolution(root.right,sum-root.val);
       
    }
    
    
    public boolean hasPathSum_DFS_Solution(TreeNode root, int sum) {    
      //#####################............DFS...........................####################
        Stack<TreeNode> stack=new Stack<>();
        if(root==null) return false;
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            if(node.left==null && node.right==null && node.val==sum) return true;
            if(node.left!=null){
                node.left.val=node.val+node.left.val;
                stack.add(node.left);
            }
            if(node.right!=null){
                node.right.val=node.val+node.right.val;
                stack.add(node.right);
            }
        }
        
        
        return false;
    }
       
}
