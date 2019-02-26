/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solutio{
    public List<String> binaryTreePaths(TreeNode root){
        List<String> list = new ArrayList<>();
        if(root == null)
            return list;
        String s = "";
        paths(root, list, s);
        return list;
    }
    private void paths(TreeNode root, list<String> list, String s){
        if(root == null)
            return;
        s += root.val + " ";
        if(root.left == null && root.right == null)
            list.add(s.trim().replace(" ", "->"));
        if(root.left != null)
            paths(root.left, list, s);
        if(root.right != null)
            paths(root.right, list, s);
    }
}
