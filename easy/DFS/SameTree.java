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
Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
*/
public class SameTree {
    /**
 * Definition for a binary tree node.
 */ class TreeNode {
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
 
    public boolean isSameTree(TreeNode p, TreeNode q) {
       if(p==null && q==null) return true;
       else if( (p!=null && q==null) ||( p==null && q!=null)) return false;
       else if(p.val!=q.val) return false;
        
       boolean left=isSameTree(p.left,q.left);
       boolean right=isSameTree(p.right,q.right);
        
        
      return left && right;
    
    
    }
}