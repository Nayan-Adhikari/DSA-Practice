/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        if (head == null) return null; // empty list

        // Case 1: deleting the head node
        if (x == 1) {
            head = head.next; // move head forward
            if (head != null) head.prev = null; // update prev of new head
            return head;
        }

        // Traverse to the x-th node
        Node temp = head;
        int i = 1;
        while (temp != null && i < x) {
            temp = temp.next;
            i++;
        }

        if (temp == null) return head; // position > length, nothing to delete

        // Case 2: deleting a middle or last node
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;

        return head;
        
    }
}