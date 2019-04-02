public class Solution {
    public int JumpFloorII(int target) {
        if(target <= 1)
            return 1;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        dp[1] = 1;
        int temp = 2;
        for(int i = 2; i <= target; i++){
            dp[i] = temp;
            temp = temp + dp[i];
        }
        return dp[target];
    }
}
