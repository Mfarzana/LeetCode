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
0--->1---->2---->3---->4---->5---->6
                         ▲                                                      |
                          |                                                       ▼
                        11<—-22<—-12<—-9<—-8 
*/
//PART I - Detect if a loop exists
//PART II - Identify the node that is the start of the loop [two pointer are point to same element]
//PART III - Eliminate the loop by setting the 'next' pointer 
//of the last element to null
public class RemoveLoopLinkedList {
            class  Node{
                int data;
               Node next;
               Node(int a){
                   data=a;
                   next=null;
               }
            }
               
             /////
                Node head=null;
                Node tail=null;    
                public  void  addNode(int data){
                          Node newNode=new Node(data);
                          if(head==null){
                              head=newNode;
                              tail=newNode;            
                          }else{
                              tail.next=newNode;
                              tail=newNode;
                          }
              }
                
    public void   removeLoop(){
            Node slow=head;
            Node fast=head;
            
          
            // Part 1: Identify Loop
            System.out.println(" // Part 1: Identify Loop...//");
            while(true){
                                            

                    if(fast==null || fast.next==null) {return;}
                    else if( fast==slow || fast.next==slow){ break;}
                    else{
                            System.out.print("f= "+fast.data+" s= "+slow.data);
                            fast=fast.next.next;
                            slow=slow.next;
                        }
             }
            
           slow=head;
            //PART II - Identify the node that is the start of the loop
           //until both the pointer  are point to the common element which is the start of the loop
            System.out.println("Find starting point of loop");
           while(fast.next != slow.next) 
            {
                fast = fast.next;
                slow = slow.next;
            }

           
        Node start = fast.next;
        //PART III - Eliminate the loop by setting the 'next' pointer 
        //of the last element to null
        
        
        
        fast = start;
        while(fast.next != start)
        {
                    System.out.print(" ."+fast.data);
                    fast = fast.next;
        }

        fast.next = null; //break the loop
    }


            public void displayNode(){
                Node curr=head;
                 System.out.println( " LinkedList data  ");    

                while(curr!=null){
                    System.out.print("  "+curr.data);
                    curr=curr.next;
                }
            }
  
    public static void main(String args[]){
        RemoveLoopLinkedList loopclass=new RemoveLoopLinkedList();        
       loopclass.addNode(1);
       loopclass.addNode(2); 
       loopclass.addNode(3);
       loopclass.addNode(4); 
       loopclass.addNode(5);
       loopclass.addNode(6); 
       loopclass.addNode(7); 
       loopclass.addNode(8);  
       loopclass.addNode(3);  
       
      loopclass.displayNode();
   loopclass.removeLoop();
         loopclass.displayNode();
    }
    
    
}
