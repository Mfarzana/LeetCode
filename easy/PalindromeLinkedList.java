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
public class PalindromeLinkedList {
            public class ListNode {
              int val;
              ListNode next;
              ListNode() {}
              ListNode(int val) { this.val = val; }
              ListNode(int val, ListNode next) { this.val = val; this.next = next; }
          }
 
        public boolean isPalindrome(ListNode head) {
               int len=0;
               ListNode temp=head;
               // Calculate Length
               while(head!=null){
                   head=head.next;
                   len++;
                   }
               // Keep First Half element to array
               int arr[]=new int[len/2];
               int i=0;               // 
               while(i<len/2){
                   arr[i]=temp.val;
                   temp=temp.next;
                   i++;
               }
               // If old value just ignore middle value// no need to compare middle element of linkedlist
               if(len%2!=0) temp=temp.next;

               // Compare two haft (left half in array and right half in Linkedlist)
                i--;        
               while(temp!=null){
                   if(arr[i]!=temp.val) return false;
                   temp=temp.next;
                   i--;
               }

               return true;
           }
}