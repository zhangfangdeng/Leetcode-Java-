class Solution1 {
    public int removeElement(int[] nums, int val){
        int t = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                count++;
            }else{
                nums[t] = nums[i];
                t++;
            }
        }
        return nums.length - count;
    }
}

class Solution2 {
    public removeElement(int[] nums, int val){
        int t = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[t] = nums[i];
                t++;
            }
        }
        return t;
    }
}
