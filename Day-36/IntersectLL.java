public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        // Traverse both lists
        while (a != b) {
            // When one pointer reaches the end, switch it to the other list's head
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        // Either both are null (no intersection), or both are at intersection node
        return a;
    }
}
