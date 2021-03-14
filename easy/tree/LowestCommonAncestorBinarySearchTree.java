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
#############                          LCA                                   #####################
Lowest common ancestor from p & q is the node wich is the first common node in ancestor of p and q
####################                       ###############################
Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

Given binary search tree:  root = [6,2,8,0,4,7,9,null,null,3,5] 

Example 1:

Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.
Example 2:

Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2
Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
 
*/
public class LowestCommonAncestorBinarySearchTree {
    
    //Lowest common ancestor from p & q is the node wich is the first common node in ancestor of p and q
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root.val == q.val || root.val == p.val) 
            return root; 
        
        if(p.val < root.val && q.val < root.val) // if both p, q are in left branch 
            return lowestCommonAncestor(root.left, p, q);
        
        else if (p.val > root.val && q.val > root.val) // if both p, q are in right branch 
            return lowestCommonAncestor(root.right, p, q); 
        
	return root; // if p in left branch and q in right branch, or p in right branch and q  left brach then their LCA  is root
}
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
}