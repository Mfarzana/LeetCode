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
public class CousinsBinaryTree_Slow_Solution {
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
          if(root==null) return false;        
          Queue<TreeNode> q=new LinkedList<>();
          q.add(root);
          int len=1;
          List<DataObj> list=new ArrayList<>();
          while(!q.isEmpty()){
              len++;
             int size=q.size();

             for(int i=0;i<size;i++){
                 TreeNode node=q.poll();               
                 if(node.left!=null){
                     q.add(node.left);
                     if(node.left.val==x || node.left.val==y){
                         list.add(new DataObj(len,node.val));
                     } 
                 }
                 if(node.right!=null){
                     q.add(node.right);
                     if(node.right.val==x || node.right.val==y){
                        list.add(new DataObj(len,node.val));
                     } 
                 }

             } 
          }
  
     
       if(list.size()>=2 && list.get(0).parent==list.get(1).parent)
           return false;       

        else {          
             if(list.size()>=2 && list.get(0).len==list.get(1).len)
                return true;   
              else
                return false;
        }
        
    }
    //Inner class
    public class DataObj{
        int len;
        int parent;
        public DataObj(int len,int parent){
            this.len=len;
            this.parent=parent;
        }
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
