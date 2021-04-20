/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Farzana
 */
/*
Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

 

Example 1:


Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: l1 = [], l2 = []
Output: []
Example 3:

Input: l1 = [], l2 = [0]
Output: [0]
 
*/
public class MargeTwoSotedLinkedList {
            public ListNode mergeTwoLists(ListNode l1, ListNode l2) {       
                    if(l1==null || l2==null){
                              return l1==null?l2:l1;
                    }
                    ListNode head=new ListNode(0);
                    ListNode mergeList=head;
                        while(l1!=null && l2!=null){
                                if(l1.val<l2.val){
                                    mergeList.next=l1;
                                    l1=l1.next;
                                }else{
                                    mergeList.next=l2;
                                    l2=l2.next;
                                }
                                mergeList=mergeList.next;
                        }
                        if(l1!=null){            
                                    mergeList.next=l1;
                        }
                        if(l2!=null){
                                  mergeList.next=l2;
                        }

                    return head.next;
                }
            public class ListNode {
                                 int val;
                                  ListNode next;
                                  ListNode() {}
                                  ListNode(int val) { this.val = val; }
                                  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
                      }
}
