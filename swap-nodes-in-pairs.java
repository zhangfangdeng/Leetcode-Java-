/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution1 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode node1 = head;
        ListNode node2 = head.next;
        
        while(node2 != null){
            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;
            if(node2.next == null || node2.next.next == null)
                break;
            node2 = node2.next.next;
            node1 = node1.next.next;
            
            
        }
        return head;
        
    }
    
    class Solution2 {
        public ListNode swapPairs(ListNode head){
            ListNode dummyed = new ListNode(0);
            dummyed.next = head;
            ListNode p = dummyed;
            while(p.next != null && p.next.next != null){
                ListNode node1 = p.next;
                ListNode node2 = node1.next;
                ListNode next = node2.next;
                node2.next = node1;
                node1.next = next;
                p.next = node2;
                p = node1;
            }
            ListNode renode = dummyed.next;
            return renode;
        }
    }

