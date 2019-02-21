/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution1{
    public boolean isBalanced(TreeNode root){
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        
        boolean leftB = isBalanced(root.leftB);
        boolean rightB = isBalanced(root.rightB);
        
        if (!leftB || !rightB)
            return false;
        
        int leftH = hightTree(root.left);
        int rightH = hightTree(root.right);
        if(Math.abs(leftH - rightH) > 1)
            return false;
        else
            return true;
    }
    public int hightTree(TreeNode root){
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return hightTree(root.left) >= hightTree(root.right) ? (hightTree(root.left) + 1) : (hightTree(root.right) + 1);
    }
}

class Solution2{
    public boolean isBalanced(TreeNode){
        return maxDepth(root) != -1;
    }
    private int maxDepth(TreeNode root){
        if(root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(left == -1 || right == -1 || Math.abs(left - right) > 1)
            return -1;
        return Math.max(right, left) + 1;
    }
}
