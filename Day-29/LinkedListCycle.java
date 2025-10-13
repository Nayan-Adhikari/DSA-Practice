public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Cycle found
                break;
            }
        }

        // Step 2: If no cycle, return null
        if (fast == null || fast.next == null) {
            return null;
        }

        // Step 3: Find the entry point of the cycle
        ListNode temp = head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }

        // Step 4: Return the node where cycle begins
        return temp;
    }
}