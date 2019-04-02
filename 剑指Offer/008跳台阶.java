public class Solution {
    public int JumpFloor(int target) {
        if (target <= 1)
            return 1;
        int[] dp = new int[target+1];
        dp[0] = 1;
        dp[1] = 1;
        int i = 2;
        while(i <= target){
            dp[i] = dp[i-1] + dp[i-2];
            i++;
        }
        return dp[target];
    }
}
