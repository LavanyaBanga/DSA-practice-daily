class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        Comparator<ListNode> comp = new Comparator<ListNode>() {

            @Override
            public int compare(ListNode a, ListNode b) {
                return a.val - b.val;
            }
        };
        PriorityQueue<ListNode> pq =
                new PriorityQueue<>(comp);
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (!pq.isEmpty()) {
            ListNode curr = pq.poll();
            temp.next = curr;
            temp = temp.next;
            if (curr.next != null) {
                pq.add(curr.next);
            }
        }

        return dummy.next;
    }
}