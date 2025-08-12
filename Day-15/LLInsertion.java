/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node temp = head;
        Node ptr = new Node(x);
        if(head == null){
            return ptr;
        }
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = ptr;
        return head;
    }
}