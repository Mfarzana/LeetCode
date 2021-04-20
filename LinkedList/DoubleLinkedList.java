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
public class DoubleLinkedList {
    class Node{
        int val;
        Node previous;
        Node next;
        
        public Node(int val){
        this.val=val;
        }
    }
    
    Node head, tail=null;
    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            head.previous=null;
            tail.next=null;
        }else{
            
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
            tail.next=null;
        }
        
    }
    
    public void display(){
        Node current=head;
           
        while(current!=null) {
            System.out.print(current.val);
            current=current.next;
        }
        
    }
    public static void main(String args[]){
        DoubleLinkedList dlist=new DoubleLinkedList();
        dlist.addNode(1);
        dlist.addNode(2);
        dlist.addNode(3);
        dlist.addNode(4);
        
        dlist.display();
    }
}
