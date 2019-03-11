/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k <= 0)
            return head;
        ListNode cursor = head;
        ListNode tail = null;
        int length = 1;
        while(cursor.next != null){
            cursor = cursor.next;
            length++;
        }
        if(length == 1)
            return head;
        
        int loop = (k % length);
        
        if(length == 1 || loop == 0)
            return head;
        
        ListNode dummyHeader = new ListNode(0);
        dummyHeader.next = head;
        ListNode temp = head;
        ListNode before = dummyHeader;
        
        while(temp.next != null){
            before = temp;
            temp = temp.next;
        }
        
        before.next = null;
        temp.next = head;
        dummyHeader.next = temp;
        
        return rotateRight(dummyHeader.next, loop - 1);
        

    }
}
