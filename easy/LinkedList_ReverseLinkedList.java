/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Farzana
 */
/*
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
*/
public class LinkedList_ReverseLinkedList {
    

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode reverseList(ListNode head) {
     if(head==null || head.next==null) return head;
        
     List<ListNode> list=new ArrayList<>();    
     while(head!=null){
         list.add(head);
         head=head.next;
     }   
       
     for(int i=list.size()-1;i>0;i--){
        list.get(i).next=list.get(i-1);         
     } 
   
    list.get(0).next=null;
        
    return list.get(list.size()-1);
        
    }
}
}