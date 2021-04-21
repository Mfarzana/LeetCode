/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.Stack;

/**
 *
 * @author Farzana
 */
/*

Given a Binary Tree of size N, extract all its leaf nodes to form a Doubly Link List strating from the left most leaf. Modify the original tree to make the DLL thus removing the leaf nodes from the tree. Consider the left and right pointers of the tree to be the previous and next pointer of the DLL respectively.

Example 1:

Input :
        1
      /   \
     2     3
    / \   / \
   4   5 6   7    

Output: 
Modified Tree :
        1
      /   \
     2     3

Doubly Link List :
4 <-> 5 <-> 6 <-> 7

*/
public class LeavesToDoubleLinkedList {
    
            public Node convertToDLL(Node root)
               {
                   // Code here
                        if(root==null) return root;

                        Stack<Node> stack=new Stack<>();
                        stack.push(root);
                        Node head=null;
                        Node tail=null;
                        while(!stack.isEmpty()){
                            Node temp=stack.pop();
                            if(temp.left==null && temp.right==null){
                                if(head==null){
                                    head=tail=temp;
                                }else{
                                    tail.right=temp;
                                    temp.left=tail;
                                    tail=temp;
                                }
                            }else{
                                if(temp.left!=null)
                                    stack.push(temp.left);
                                else if(temp.right!=null)
                                    stack.push(temp.right);
                            }
                   }


               return head;  
               }
               class Node{
                        int data;
                        Node left;
                        Node right;
                        Node(int data){
                            this.data = data;
                            left=null;
                            right=null;
                        }
           }
}


