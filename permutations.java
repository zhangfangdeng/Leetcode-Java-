class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> permute(int[] nums) {
        list = new ArrayList<List<Integer>>();
        if(nums.length == 0)
            return list;
        dfs(nums, 0);
        return list;
    }
    public List<Integer> toList(int nums[]){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++)
            list.add(nums[i]);
        return list;
    }
    public void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
    public void dfs(int[] nums, int index){
        if(index == nums.length)
            list.add(toList(nums));
        for(int i = index; i < nums.length; i ++){
            swap(nums, i, index);
            dfs(nums, index + 1);
            swap(nums, index, i);
        }
    }
}
