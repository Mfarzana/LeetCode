/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy;

import java.util.ArrayList;

/**
 *
 * @author Farzana
 */
public class RemoveNthNodeFromEndOfLinkedList {
     public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public ListNode removeNthFromEnd(ListNode head, int n) {
            ArrayList<ListNode> list=new ArrayList<>();
            ListNode renode=head;
            while(head!=null){
                list.add(head);
                head=head.next;
            }
            /*            Input: head = [1], n = 1,        Output: []            */
        if(list.size()==1) // 
            return null;
        /*        Input: head = [1,2,3], n = 3,        Output: [2,3]        */
        else if(n==list.size())
            return list.get(1);
        else{
            // Input: head = [1,2,3,4,5], n = 2 Output: [1,2,3,5]
            ListNode pre=list.get(list.size()-n-1);
            pre.next=pre.next.next;
        }
        
        return renode;
    }
}