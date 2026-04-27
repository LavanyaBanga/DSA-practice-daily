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
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(-1);
        ListNode res = less;
        ListNode great = new ListNode(-1);
        ListNode res2 = great;
        while(head!=null)
        {
            if(head.val<x)
            {
                less.next = head;
                less = head;
                head = head.next;
                less.next =null;
            }
            else
            {
                great.next = head;
                great = head;
                head= head.next;
                great.next = null;
            }
        }
        less.next = res2.next;
        return res.next;
    }
}