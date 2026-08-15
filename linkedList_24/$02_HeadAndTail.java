package linkedList_24;

import java.lang.Thread.State;

public class $02_HeadAndTail {
    
    public static class LinkedList {

        public static class Node{
        int data ;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
       }

       public static Node head;
       public static Node tail;

       public void addFirst(int data){

            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }

            newNode.next = head;  // link
            head = newNode;
       }

       public void addLast(int data){

          Node newNode = new Node(data);
          if (head == null) {
            head = tail = newNode;
            return;
          }

          tail.next = newNode;
          tail  = newNode;
       }

       // add at middle
       public void add(int idx, int data){

        if (idx == 0) {
            addFirst(data);
            return;
        }
         
         Node newNode = new Node(data);
         Node temp = head;
         int i = 0;
         while (i < idx-1) {

            temp = temp.next;
            i++;
         }

         newNode.next = temp.next;
         temp.next = newNode;
       }

       public void printLL(){
              
              if(head == null){
              System.out.println("LL is empty");
              return;
           }
           Node temp = head;
           while (temp != null) {
               System.out.println(temp.data);
               temp = temp.next;
           }
       }

       public static void main(String[] args){

            LinkedList ll = new LinkedList();
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(3);
            ll.addLast(4);
            ll.printLL();
            System.out.println("--------------------");
            ll.add(2, 5);
            ll.printLL();
            // System.out.println("reference value = "+ll.head);     // just for see inside value of reference 
       }
    
        
    }
}
