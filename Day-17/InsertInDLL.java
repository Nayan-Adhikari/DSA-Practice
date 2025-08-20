/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node addNode(Node head, int p, int x) {
        // code here
        Node temp = head;
        Node newNode = new Node(x);

        // Step 1: Traverse to the node at position p
        for (int i = 0; i < p; i++) {
            temp = temp.next;
        }

        // Step 2: Insert newNode after temp
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {   // if not inserting at end
            temp.next.prev = newNode;
        }

        temp.next = newNode;

        return head;
    }
}