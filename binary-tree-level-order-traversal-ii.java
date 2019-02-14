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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if(root == null)
            return lists;
        List<TreeNode> list1 = new ArrayList<TreeNode>();
        List<TreeNode> list2 = new ArrayList<TreeNode>();
        
        list1.add(root);
        TreeNode temp = null;
        while(list1.size()!=0){
            List<Integer> inner = new ArrayList<Integer>();
            for(int i = 0; i < list1.size(); i++){
                temp = list1.get(i);
                inner.add(temp.val);
                if(temp.left!=null)
                    list2.add(temp.left);
                if(temp.right!=null)
                    list2.add(temp.right);
            }
            list1 = list2;
            list2 = new ArrayList<TreeNode>();
            lists.add(0,inner);
        }
        return lists;
    }
}
