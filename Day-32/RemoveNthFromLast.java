class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Move first n+1 steps ahead so the gap between first and second is n nodes
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Now second.next is the node to delete
        second.next = second.next.next;

        return dummy.next;
    }
}