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
    public TreeNode covertBST(TreeNode root) {
        cover(root, 0);
        return root;
    }
    private int cover(TreeNode root, int sum){
        if(root == null)
            return sum;
        int sum2 = cover(root.right, sum);
        root.val += sum2;
        sum2 = root.val;
        sum2 = cover(root.left, sum2);
        return sum2;
    }
}
