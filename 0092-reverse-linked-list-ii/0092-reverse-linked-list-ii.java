class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) return head;
        
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        int pos = 0;
        
      
        while (temp != null) {
            pos++;
            if (pos >= left && pos <= right) {
                st.push(temp.val);
            }
            temp = temp.next;
        }
        
       
        temp = head;
        pos = 0;
        while (temp != null) {
            pos++;
            if (pos >= left && pos <= right) {
                temp.val = st.pop();
            }
            temp = temp.next;
        }
        
        return head;
    }
}