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
    public TreeNode buildTree(int[] inorder, int[] postorder){
        if(inorder.length == 0)
            return null;
        return helpBuild(inorder, postorder, postorder.length - 1, 0, inorder.length);
    }
    public TreeNode helpBuild(int[] in, int[] post, int postIndex, int inFrom, int inTo){
        if(inFrom >= inTo)
            return null;
        TreeNode root = new TreeNode(post[postIndex]);
        for(int i = inFrom; i < inTo; i++){
            if(in[i] == post[postIndex]){
                root.right = helpBuild(in, post, postIndex - 1, i + 1, inTo);
                root.left = helpBuild(in, post, postIndex - (inTo - i), inFrom, i);
                break
            }
        }
        return root;
    }
}


// 时间用的更少，空间用的更少
class Solution2{
    public TreeNode buildTree(int[] inorder, int[] postorder){
        return buildTree(inorder, postorder, 0, inorder.length - 1; postorder.length - 1);
    }
    
    public TreeNode buildTree(int[] inorder, int[] postorder, int inStart, int inEnd, int postEnd){
        if(inStart > inEnd)
            reutrn null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int index = 0
        for(int i = inEnd; i >= inStart; i++){
            if(root.val == inorder[i]){
                index = i;
                break;
            }
        }
        root.right = buildTree(inorder, postorder, index + 1, inEnd, postEnd - 1);
        root.left = buildTree(inorder, postorder,inStart, index - 1, postEnd - 1 + index - inEnd);
        return root;
    }
}
