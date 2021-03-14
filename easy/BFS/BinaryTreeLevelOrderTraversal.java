/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.BFS;

import easy.BFS.MaximumDepthofBinaryTree.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Farzana
 */
/*
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
*/
public class BinaryTreeLevelOrderTraversal {
    
public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> list=new ArrayList();
        if(root==null) return list;        
        queue.add(root);
        
        while(!queue.isEmpty()){      
             int size=queue.size();
             List<Integer> siblings=new ArrayList<>();            
            
            for(int i=0;i<size;i++){
                TreeNode node=(TreeNode) queue.poll();   
                siblings.add(node.val);
                
                if(node.left!=null)
                    queue.add(node.left);
                
                if(node.right!=null) 
                    queue.add(node.right);
                    
                
            }
            
            
            if(siblings.size()>0) list.add(siblings);
            
            
            
        }
        
        Collections.reverse(list);
        
        return list;
        
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
