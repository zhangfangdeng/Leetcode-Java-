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
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        
        
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        
        
        if(r!=0 && l!=0)
            return Math.min((1+r),(1+l));
        else if(l== 0)
            return 1+r;
        else
            return 1+l;
    }
}
