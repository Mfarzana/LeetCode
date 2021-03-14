/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Farzana
 */
// Solution with BFS --- Level  Order Traversal 
public class BinaryTreeRightSideView {
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
    public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list=new ArrayList<>();
            Queue<TreeNode> queue=new LinkedList<>();
            if(root!=null) queue.add(root);
            
            while(!queue.isEmpty()){
                        int size=queue.size();
                        while(size>0){
                                TreeNode n=queue.poll();                
                                if(size==1)list.add(n.val);                
                                if(n.left!=null) queue.add(n.left);
                                if(n.right!=null) queue.add(n.right);

                            size--;
                        }

            }
        
        return list;
    }
}