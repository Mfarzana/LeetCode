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
/*
Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5

Input:  1->1
Output:[]

*/
public class LinkedRemoveListElements {
    
public ListNode removeElements(ListNode head, int val) {
        //if(head==null) return head;
       
        while(head!=null && head.val==val)
            head=head.next;
        
        ListNode curr=head;
        ListNode pre=null;
        while(curr!=null){
          if(curr.val==val){
              pre.next=curr.next;
            
          }else
              pre=curr;
            
         curr=curr.next; 
            
          
        }
        return head;
    }
public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}