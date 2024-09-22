package LinkedList;

public class MiddleOfTheLinkedList_876 {
    class Node {
        int node;
        ReverseLinkedList_206.Node next;

        public Node(int node) {
            this.node = node;
        }

        public Node(int node, ReverseLinkedList_206.Node next) {
            this.node = node;
            this.next = next;
        }
    }

//    public Node middleNode(Node head) {
//
//        Node slow = head;
//        Node fast = head;
//        while (fast!=null && fast.next!=null){
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        return slow;
//
//    }

}
