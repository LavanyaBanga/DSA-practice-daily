class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode curr = head; // Find length and last node
        int len = 1;

        while (curr.next != null) {
            curr = curr.next;
            len++;
        }
        k = k % len;// Reduce unnecessary rotations

        if (k == 0) return head;

        curr.next = head;
        ListNode newTail = head;// Find the new tail
        int steps = len - k;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next; // New head is next node
        newTail.next = null;  // Break the circle

        return newHead;
    }
}