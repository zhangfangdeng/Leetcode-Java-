/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution1 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode start = dummyHead;
        ListNode next = start.next;
        boolean t = false;
        
        while(next != null){
            if(next.next != null || next.val != next.next.val){
                if(!t){
                    next = next.next;
                    start = start.next;
                }
                else{
                    next = next.next;
                    start.next = next;
                    t = false;
                }
            }
            else{
                next = next.next;
                t = true;
            }
        }
        return dummyHead.next;
    }
}


class Solution2 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        
        if (head.next != null && head.val == head.next.val) {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            return deleteDuplicates(head.next);
        } else {
            head.next = deleteDuplicates(head.next);
        }
        
        return head;
    }
}
