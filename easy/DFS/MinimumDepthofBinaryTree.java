/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.DFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Farzana
 */
/*
case 0: if there no left && right side return 1; // only root node
case 1: return height of left subtree if righ side no subtree
case 2: return height of right subtree if left side no subtree

*/
public class MinimumDepthofBinaryTree {
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
     //
     //Solution 1 By Recursive
     
   public int minDepth_Recursive_Solution(TreeNode root) {
        if(root ==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1; // no child/ leaf node
       
        int left = (root.left != null) ? 1+minDepth_Recursive_Solution(root.left) : Integer.MAX_VALUE; 
        int right = (root.right != null) ? 1+ minDepth_Recursive_Solution(root.right) : Integer.MAX_VALUE;
        
        return Math.min(left,right); 
    }
   
   // Using BFS 
    public int minDepth_BFSsolution(TreeNode root){
        if(root==null) return 0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int level=0;
        while(!queue.isEmpty()){
             level++;      
             int size=queue.size();
             for(int i=0;i<size;i++){
                 TreeNode node=(TreeNode) queue.poll();                
                 if(node.left==null && node.right==null) return level;
                 if(node.left!=null) queue.add(node.left);
                 if(node.right!=null) queue.add(node.right);
            }
            
            
        }
        
        return level;
    }
}