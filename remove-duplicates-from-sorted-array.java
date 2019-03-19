class Solution1 {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length <= 1){
            return nums.length;
        }
        int len = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1])
                len++;
        }
        int i = 0;
        int j = 0;
        int temp = nums[0];
        while(i < len && j < nums.length){
            nums[i] = temp;
            i++;
            while(j < nums.length - 1 && nums[j] == temp)
                j++;
            temp = nums[j];
        }
        return len;
    }
}
class Solution2 {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length <= 1){
            return nums.length;
        }
        int cur = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[cur]){
                nums[cur + 1] = nums[i];
                cur++
            }
        }
        return cur+1;
    }
}
