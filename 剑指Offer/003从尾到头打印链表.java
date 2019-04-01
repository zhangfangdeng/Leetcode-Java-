/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        ListNode p = null;
        ListNode curr = listNode;
        while(curr != null){
            ListNode t = curr.next;
            curr.next = p;
            p = curr;
            curr = t;
        }
        
        while(p != null){
            res.add(p.val);
            p = p.next;
        }
        return res;
    }
}
