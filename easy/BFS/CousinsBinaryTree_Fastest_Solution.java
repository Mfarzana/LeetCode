/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.BFS;

import easy.BFS.MaximumDepthofBinaryTree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Farzana
 */
public class CousinsBinaryTree_Fastest_Solution {
    // Solutuon BFS, traversing level by level.
    //If both objects are on the same level then just make sure the parent nodes are not equal.
    

class Solution {
    
    /*
In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
Return true if and only if the nodes corresponding to the values x and y are cousins.

Example 1:
Input: root = [1,2,3,4], x = 4, y = 3
Output: false
Example 2:
Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
Output: true
Example 3:
Input: root = [1,2,3,null,4], x = 2, y = 3
Output: false
*/
      public boolean isCousins(TreeNode root, int x, int y) {
        //if 2 height are not same return false;
        
        int heightx= getHeight(root,x,0);
        int heighty= getHeight(root,y,0);
        if(heightx!=heighty) return false;
        
        //if parentx != parenty return true;
        
        int parentx= getParent(root,x,-1);
        int parenty= getParent(root,y,-1);
        
        //if(parentx==-1 | parenty==-1) return false;
        
        return parentx!=parenty?true:false;
    }
    
    public int getHeight(TreeNode node,int x,int height){        
        if(node==null) return 0;
        if(node.val==x) return height;     
        return (getHeight(node.left,x,height+1))|(getHeight(node.right,x,height+1));
    }
    public int getParent(TreeNode node, int x, int parent){
        if(node==null) return -1;
        if(node.val==x) return parent;    
        parent=getParent(node.left,x,node.val);
        if(parent!=-1) return parent;
        parent=getParent(node.right,x,node.val);
         if(parent!=-1) return parent;
        
        return parent;
    }
}
    
    
    
    
    
    
//TreeNode for Binary Tree
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