class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null)
            return null;
       ArrayList<Integer> list = new ArrayList<>();
       ListNode curr = head;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(list);
        curr = head;
        int index = 0;

        while(curr != null){
            curr.val = list.get(index++);
            curr = curr.next;
        }

        return head;
    }
}