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
Convert Binary Number in a Linked List to Integer
Easy

1122

66

Add to List

Share
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

 

Example 1:


Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
Example 2:

Input: head = [0]
Output: 0
Example 3:

Input: head = [1]
Output: 1
Example 4:

Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
Output: 18880
Example 5:

Input: head = [0,0]
Output: 0
*/
public class BinaryLinkedListToIntegerNumber {
    
             public int getDecimalValue(ListNode head) {
                        ListNode temp=head;
                        int count=0;
                        int result=0;
                        while(temp.next!=null){
                            count++;
                            temp=temp.next;
                        }
                        while(head!=null){
                            if(head.val==1){
                                 result+=Math.pow(2, count); 
                            }

                            count--;
                            head=head.next;
                        }
                        return result;
                    }
           public class ListNode {
                        int val;
                         ListNode next;
                         ListNode() {}
                         ListNode(int val) { this.val = val; }
                         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
             }
}
