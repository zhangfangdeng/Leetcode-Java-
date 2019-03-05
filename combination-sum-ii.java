class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> listAll = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        
        Arrays.sort(candidates);
        find(listAll, list, candidates, target, 0);
        return listAll;
    }
    public void find(List<List<Integer>> listAll, List<Integer> tmp, int[] candidates, int target, int num) {
        if(target == 0){
            listAll.add(tmp);
            return;
        }
        if(target < candidates[0]){
            return;
        }
        while(num < candidates.length && candidates[num] <= target){
            List<Integer> list = new ArrayList<>(tmp);
            list.add(candidates[num]);
            find(listAll, list, candidates, target - candidates[num], num + 1);
            int q = num;
            while(q + 1 < candidates.length && candidates[num] == candidates[q+1]){
                q++;
            }
            if(q > num){
                num = q + 1;
                if(q == candidates.length - 1){
                    break;
                }
            }else{
                num++;
            }
        }
    }
}
