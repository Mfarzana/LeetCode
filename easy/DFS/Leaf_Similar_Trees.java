/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.DFS;

import java.util.LinkedList;

/**
 *
 * @author Farzana
 */
/*
Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
Two binary trees are considered leaf-similar if their leaf value sequence is the same.
Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

Example 1:
Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
Output: true
Example 2:

Input: root1 = [1], root2 = [1]
Output: true
Example 3:

Input: root1 = [1], root2 = [2]
Output: false
Example 4:

Input: root1 = [1,2], root2 = [2,2]
Output: true
Example 5:


Input: root1 = [1,2,3], root2 = [1,3,2]
Output: false
*/
public class Leaf_Similar_Trees {
    class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
         LinkedList<Integer>list=new LinkedList<>();
         LinkedList<Integer> list2=new LinkedList<>();
         leafNode(root1,list);
        leafNode(root2, list2);
        
        /*Stack<TreeNode> stack=new Stack();
        stack.push(root1);
        stack.push(root2);
       // int duplicateCount=0;
        while(!stack.isEmpty()){
            TreeNode curr=stack.pop();
            if(curr.left!=null)
                stack.push(curr.left);
            if(curr.right!=null)
                stack.push(curr.right);
            if(curr.left==null && curr.right==null){
                if(list.contains(curr.val)) //duplicateCount++;
                    list2.add(curr.val);
                else
                    list.add(curr.val);
            }
        }*/
        if(list.size()!=list2.size()) return false;
        
        for(int i=0;i<list.size();i++){
            if(list.get(i)!=list2.get(i)) return false;
        }
        
       // return list.size()==duplicateCount?true:false;
        return true;
    }
    
    public void leafNode(TreeNode node, LinkedList<Integer> list){
        if(node==null) return;
        if(node.left==null && node.right==null) list.add(node.val);
        if(node.left!=null) leafNode(node.left, list);
        if(node.right!=null) leafNode(node.right, list);
    }
    
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