/*
Structure of a Doubly LinkedList
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
    public Node delPos(Node head, int x) {
        if (head == null) return null;

        // Case 1: delete head
        if (x == 1) {
            head = head.next;
            if (head != null) head.prev = null;
            return head;
        }

        // Traverse to the node at position x
        Node curr = head;
        for (int i = 1; i < x && curr != null; i++) {
            curr = curr.next;
        }

        // If position is out of range
        if (curr == null) return head;

        // Adjust pointers
        if (curr.prev != null) {
            curr.prev.next = curr.next;
        }
        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }

        return head;
    }
}
