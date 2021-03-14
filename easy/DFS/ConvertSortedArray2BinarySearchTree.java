/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.DFS;

/**
 *
 * @author Farzana
 */
/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5
*/
public class ConvertSortedArray2BinarySearchTree {
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
    public TreeNode sortedArrayToBST(int[] nums) {     
            if(nums.length==0 || nums==null) return null;
            return add(nums,0,nums.length-1);
        }
    public TreeNode add(int nums[],int start, int end){    
        if(start>end) return null;
        int mid=(start+end)/2;

        System.out.println("start "+start+" end "+end+" mid "+mid+" val "+nums[mid]);
        TreeNode node=new TreeNode(nums[mid]);
        node.left=add(nums,start, mid-1); 
        node.right=add(nums,mid+1, end);

        return node;
    }


    
    
}