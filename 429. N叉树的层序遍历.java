/*
 // Definition for a Node.
 class Node {
 public int val;
 public List<Node> children;
 
 public Node() {}
 
 public Node(int _val,List<Node> _children) {
 val = _val;
 children = _children;
 }
 };
 */
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, root, 0);
        return res;
    }
    public void helper(List<List<Integer>> list, Node root, int level){
        if(root == null)
            return;
        if(list.size() == level){
            List<Integer> arr = new ArrayList<>();
            arr.add(root.val);
            list.add(arr);
        }else{
            list.get(level).add(root.val);
        }
        for(Node child : root.children){
            helper(list, child, level+1);
        }
    }
}

