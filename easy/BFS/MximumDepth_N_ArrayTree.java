/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.BFS;

import java.util.List;

/**
 *
 * @author Farzana
 */
/*
Given a n-ary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).

 

Example 1:
Input: root = [1,null,3,2,4,null,5,6]
Output: 3
Example 2:

Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: 5
*/
public class MximumDepth_N_ArrayTree {

    // Recursive Solution 
    public int maxDepth(Node root) {
        if(root==null) return 0;
        int len=0;
        for(Node node:root.children){
            int curr=maxDepth(node);
            len=Math.max(len,curr);
        }
        
        return 1+len;
    }
    //DFS Solution
    
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