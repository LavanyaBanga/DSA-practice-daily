/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode head = null,tail = null;
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val - b.val);
        for(ListNode tempHead : lists){
            if(tempHead != null)
                pq.add(tempHead);
        }
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            if(node.next != null)
                pq.offer(node.next);
            insertNode(node);
        }
        return head;
    }
    private void insertNode(ListNode node){
        node.next = null;
        if(head == null){
            head = tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }
}