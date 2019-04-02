/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = helper(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    private TreeNode helper(int[] pre,int preStart,int preEnd,int[] in,int inStart,int inEnd){
        if(preStart > preEnd || inStart > inEnd)
            return null;
        TreeNode root = new TreeNode(pre[preStart]);
        for(int i = inStart; i <= inEnd; i++){
            if(pre[preStart] == in[i]){
                root.left = helper(pre,preStart+1,preStart+i-inStart,in, inStart,i-1);
                root.right = helper(pre,preStart+i-inStart+1,preEnd,in,i+1,inEnd);
                break;
            }
        }
        return root;
    }
}
