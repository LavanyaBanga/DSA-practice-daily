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
    public ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public void reorderList(ListNode head) {
        ListNode mid=findMid(head);
        ListNode curr=mid.next;
        mid.next=null;
        ListNode prev=null;
        ListNode nextNode;
        while(curr!=null){
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        ListNode head1=head;
        ListNode head2=prev;
        while(head1 != null && head2 != null){
            ListNode next1 = head1.next;
            ListNode next2 = head2.next;

            head1.next = head2;
            if(next1 == null) break;

            head2.next = next1;

            head1 = next1;
            head2 = next2;
        }
    }
}