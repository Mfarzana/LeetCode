/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.DFS;

/**
 *
 * @author Farzana
 */
/* 
both subtrees are balanced themselves if 
height diff between subtrees are no more than 1
## left subtree/ right subtree hight can be equal or differ by 1( differ not more than 1)

*/
public class BalancedBinaryTree {
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
 
 boolean result=true;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        
        getHeight(root);
        return result;
           
    }
    
    public int getHeight(TreeNode root){
        if(root ==null) return 0;
                
        int left=1+getHeight(root.left);
        int right=1+getHeight(root.right);
        
        int diff=Math.abs(left-right);
        if(diff>1) result=false;
        
        return Math.max(left,right);        
    }
}