/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.BFS;

/**
 *
 * @author Farzana
 */
/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
 

But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3
 
*/
public class SymmetricTree {
    /**
 * Definition for a binary tree node.
 */
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
 
 public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return  true;             
        else 
            return isMirror(root.left, root.right);        
        
    }
    public boolean isMirror(TreeNode left, TreeNode right){
        if(left==null && right ==null) return true;
        if(left==null || right==null)  return false;
         
        return left.val==right.val && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}