class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        dfs(res, n, k, list);
        return res;
    }
    public void dfs(List<List<Integer>> res, int n, int k, List<Integer> list) {
        if(n < 0 || k < 0)
            return;
        if(k == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(n);
        dfs(res, n - 1, k - 1, list);
        list.remove(list.size() - 1);
        dfs(res, n - 1, k, list);
    }

}
