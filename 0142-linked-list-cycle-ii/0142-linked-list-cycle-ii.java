public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        
        if (fast == null || fast.next == null) return null;

        
        slow = head;
        int count = 0;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
            count++;
        }

        return slow;
    }
}
