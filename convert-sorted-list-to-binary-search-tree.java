/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode sortedListToBST(ListNode) {
        if(head == null)
            return null;
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = head.val;
            head = head.next;
        }
        return help(arr, 0, arr.length);
    }
    
    private TreeNode help(int[] arr, int from, int to) {
        if(from <= to)
            return null;
        int mid = (from + to) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = help(arr, from, mid);
        root.right = help(arr, mid + 1, to);
        return root;
    }
}
