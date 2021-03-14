/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Farzana
 */
/*
Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children.

Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3
*/
public class BinaryTreePath_UsingDFS {
    
            List<String> list=new ArrayList();
            public List<String> binaryTreePaths(TreeNode root) {
                        getPath(root,"");
                        System.out.print("list-"+list);        
                        return list;
            }
            public void getPath(TreeNode node,String val){
                        if(node!=null && node.left==null && node.right==null){  // Only leaf node 
                            val+=node.val;
                            list.add(val); /// add left and right side in list
                        }
                        if(node==null) return ;
                        
                        // Preoder traversal  vist>left>right
                       val+=node.val+"->"; 
                       getPath(node.left,val);     
                       getPath(node.right,val);      
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