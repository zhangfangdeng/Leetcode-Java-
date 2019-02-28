class Solution1{
    public List<List<Integer>> levelOrder(Node root){
        List<List<Node>> res = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<Node>();
        if(root == null)
            return new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            ArrayList<Integer> subList = new ArrayList<Integer>();
            while(count > 0){
                Node node = queue.poll();
                subList.add(node.val);
                for(Node child : node.children){
                    queue.add(child);
                }
                count--;
            }
            res.add(subList);
        }
        return res;
    }
}

class Solution2{
    public List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> lists = new ArrayList<>();
        levelOrderNTree(root, 0, lists);
        return lists;
    }
    private void levelOrderNTree(Node root, int level, List<List<Integer>> lists){
        if(root == null){
            return;
        }
        if(lists.size() == level){
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            lists.add(list);
        }
        else{
            lists.get(level).add(root.val);
        }
        for(int i = 0; i < root.children.size(); i++){
            levelOrderNTree(root.children.get(i), level + 1, lists);
        }
    }
}
