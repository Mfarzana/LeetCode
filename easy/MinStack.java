/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

/**
 *
 * @author Farzana
 */
// ## Explanation
// In Linked list  when we add value 2,4,1,3,5, value store  like : 2>4>1>3>5
// But this problems value store like , 5>3>1>4>2
/*
case  2: 
            stack>>>: node.val=2, top=2, min=2, and 2 point to nothing
case 4
            stack >>>: node.val=4, top-4 and min=2, and 4 point to 2
case 1:
          stack>>>  node.val=1, top=1, min=1, 1 point to 4
case 3:
           stack>>>  node.val=3, top=3, min=1, and 3 point 1
case 5
            stack>>> node.val=5, top=5 , min=1, and 5 point to 3

*/
public class MinStack {
    

    /** initialize your data structure here. */
    Node top;
    
    public MinStack() {
        
    }
    
    public void push(int x) {
        Node node=new Node(x);
        if(top==null){            
            top=node;
            node.min=x;
        }else{
            node.next=top;
            if(top.min>x)
                node.min=x;
            else
                node.min=top.min;
            
            top=node;
        }
    }
    
    public void pop() {
        top=top.next;
    }
    
    public int top() {
        return top.val;
    }
    
    public int getMin() {
        return top.min;
    }
    
    class Node{
        public int val;
        public Node next;
        public int min;
        public Node(int val){
            this.val=val;
        }
    }
}




/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */