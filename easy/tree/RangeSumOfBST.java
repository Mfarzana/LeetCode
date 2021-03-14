/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.tree;

/**
 *
 * @author Farzana
 */
/*
Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.

 

Example 1:

Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32
Example 2:

Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
Output: 23
 
*/
public class RangeSumOfBST {
    
 public int rangeSumBST(TreeNode root, int L, int R) {
     if(root==null) return 0;
     if(root.val>=L && root.val<=R)
         return root.val+rangeSumBST(root.left,L,R)+rangeSumBST(root.right,L,R);
      else if(root.val<L)
          return rangeSumBST(root.right,L,R);
    
      else 
          return rangeSumBST(root.left,L,R);
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