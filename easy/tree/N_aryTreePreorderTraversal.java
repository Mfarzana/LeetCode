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
Given an n-ary tree, return the preorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).

 

Follow up:

Recursive solution is trivial, could you do it iteratively?

 

Example 1:



Input: root = [1,null,3,2,4,null,5,6]
Output: [1,3,5,6,2,4]
Example 2:



Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]
*/
public class N_aryTreePreorderTraversal {
    // ...............Solution 1.......................
     List<Integer> list=new ArrayList<>();
    public List<Integer> preorder(Node root) {
            if(root==null)
                return list;
            doPreorder(root);

            return list;    
        }
        public void doPreorder(Node node){
            list.add(node.val);
            //System.out.print("list "+list);
            
            for(Node n:node.children){
                doPreorder(n);
            }
        }
      // .................Solution 2  .............................
            public List<Integer> preorderSolution2(Node root) {
                    List<Integer> list=new ArrayList<>();

                    if(root==null)
                               return list;

                    list.add(root.val);
                        for(Node node:root.children){
                           // System.out.print(list+" ");
                           list.addAll(preorder(node));     

                        }        
                return list;    
                
        }

// Definition for a Node.
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };


        

}