class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        perm(list, nums, 0, nums.length - 1);
        return list;
    }
    public List<Integer> set(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }
        return list;
    }
    public void swap(int[] nums, int L, int R) {
        int tmp = nums[L];
        nums[L] = nums[R];
        nums[R] = tmp;
    }
    public void perm(List<List<Integer>> list, int[] nums, int L, int R ) {
        if(L == R){
            list.add(set(nums));
        }
        else{
            int i = L;
            while(i <= R) {
                int tmp = nums[i];
                int j = i;
                while(j < nums.length && nums[j] == tmp){
                    j ++;
                }
                swap(nums, L, i);
                int[] a2 = nums.clone;
                perm(list, a2, L + 1, R);
                i = j;
            }
        }
        return;
    }
}
