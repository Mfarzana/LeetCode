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
public class BinaryTree_SumOfLeftLeaves {
    
    /// Solution 1 
    int leafLeftSum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        getSum(root, false);
        return leafLeftSum;        
    }
    public void getSum(TreeNode root, Boolean isLeft){
        
         if(root !=null && root.left==null && root.right==null && isLeft){          
            leafLeftSum+=root.val;
            return ;
        }
        if(root==null) return;
        
        getSum(root.left,true);       
        getSum(root.right,false);        
        
    }
    
    //  ...............### Solution 2........................
     public int sumOfLeftLeaves2(TreeNode root) {
        return getSum2(root, false);       
    }
    public int getSum2(TreeNode root, Boolean isLeft){
         if(root==null) return 0;
         if(root !=null && root.left==null && root.right==null){          
            return isLeft?root.val:0;
        }
        return  getSum2(root.left,true)+getSum2(root.right,false);        
        
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