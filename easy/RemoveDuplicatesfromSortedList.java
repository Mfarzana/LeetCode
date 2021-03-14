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
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3

Input: 1->1->1->2
Output: 1->2
*/
public class RemoveDuplicatesfromSortedList {
    /**
 * Definition for singly-linked list.
 */public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
 
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node=head;
        while(node!=null){
            ListNode next=node.next;
            if(next!=null && node.val==next.val){
                node.next=next.next;
                
            }else{
                node=node.next;
            }
        }
        
        return head;
        
    }
}
