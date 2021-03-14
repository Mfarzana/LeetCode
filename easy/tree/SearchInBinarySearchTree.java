/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Farzana
 */
/*

public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(val>root.val)
            return searchBST(root.right, val);
        else if(val<root.val)
            return searchBST(root.left,val);
        else
            return root;
    
    }
*/
public class SearchInBinarySearchTree {
    
// faster  solution than soultion 1
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(val>root.val)
            return searchBST(root.right, val);
        else if(val<root.val)
            return searchBST(root.left,val);
        else
            return root;
    
    }
    
    // Solution 1 but not wise    
    
public TreeNode searchBSTSolution1(TreeNode root, int val) {
        if(root==null) return null;
        Queue<TreeNode> qlist=new LinkedList<>();
        qlist.add(root);
        
        while(!qlist.isEmpty()){
                TreeNode node=qlist.poll();
                if(node.val==val) return node;
                if(node.left!=null)
                    qlist.add(node.left);
                 if(node.right!=null)
                    qlist.add(node.right);          

        }
        
        return null;
    
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
