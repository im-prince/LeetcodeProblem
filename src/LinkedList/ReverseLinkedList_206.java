package LinkedList;

import java.util.LinkedList;

public class ReverseLinkedList_206 {

 class Node{
     int node;
     Node next;

    public Node(int node) {
        this.node = node;
    }

    public Node(int node, Node next) {
        this.node = node;
        this.next = next;
    }
}

   static Node reverseList(Node head) {

     Node curr = head;
     Node prev = null;
     while (curr!= null){
         Node temp = curr.next;
         curr.next= prev;
         prev=curr;
         curr= temp;

     }
     return prev;
    }

}

