/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        
        ListNode mPre = dummyHead;
        ListNode nNext;
        
        ListNode cur;
        ListNode next;
        
        for(int i = 0; i < m - 1; i++) {
            mPre = mPre.next;
        }
        
        cur = mPre.next;
        next = cur.next;
        nNext = next;
        
        for(int i = 0; i < n - m; i++) {
            nNext = nNext.next;
            next.next = cur;
            cur = next;
            next = nNext;
        }
        mPre.next.next = nNext;
        mPre.next = cur;
        return dummyHead.next;
    }

}
