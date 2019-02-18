//用空间省时间
class Solution1 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length <= 1)
            return false;
        
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(temp.get(nums[i]) == null)
                temp.put(nums[i], i);
            else{
                if(i - temp.get(nums[i]) <= k)
                    return true;
                temp.put(nums[i], i);
            }
        }
        return false;
    }
}

//用时间省空间
class Solution2{
    public boolean containsNearbyDuplicate(int[] nums, int k){
        if(nums.length <= 1)
            return false;
        
        int i = 0;
        int j;
        while(i < nums.length - 1){
            j = i + 1;
            while(j < nums.length && j - i <=k){
                if(nums[j] == nums[i])
                    return true;
                j++;
            }
            i++;
        }
        return false;
    }
}
