class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode current=head;
         while (head != null && head.val == val) {
            head = head.next;
        }

     
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; 
            } else {
                current = current.next;
            }
        }
          
        
        return head;
        
    }
}