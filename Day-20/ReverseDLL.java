/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        if (head == null || head.next == null) {
            // No change is needed;
            // return the current head
            return head; 
        }
        
         // Initialize a pointer to
         // the previous node        
        Node prev1 = null;
        
        // Initialize a pointer to
        // the current node
        Node current = head;
        
        // Traverse the linked list
        while (current != null) {
            
            // Store a reference to
            // the previous node
            prev1 = current.prev;
            
            // Swap the previous and
            // next pointers
            current.prev = current.next;
            
            // This step reverses the links
            current.next = prev1;
            
            // Move to the next node
            // in the orignal list
            
            current = current.prev;
        }

        // The final node in the original list
        // becomes the new head after reversal
        return prev1.prev;
    }
}