/**
 * 动态规划DP，有三重循环。
 * 第一重循环是确定每个阶段所截取的每组气球的个数，
 * 第二重循环是确定分组，获得每组气球的起始下标，
 * 第三重循环是选择刺破的气球下标 *
 *
 * https://blog.csdn.net/u014626513/article/details/81146851
 */

public class Solution {
    public int maxCoins(int[] iNums){
        int n = iNums.length;
        int[] nums = new int[n+2];
        for(int i = 0; i < n; i++){
            nums[i+1] = iNums[i];
        }
        
        nums[0] = 1;
        nums[n+1] = 1;
        
        int[][] dp = new int[n+2][n+2];
        for(k = 1; k <= n; k++){
            for(int i = 1; i<=n-k+1; i++){
                int j = i+k-1;
                for(int x = i; i <= j; x++){
                    dp[i][j] = Math.max(dp[i][j], dp[i][x-1]+nums[i-1]*nums[x]*nums[j+1]+dp[x+1][j]);
                }
            }
        }
        return dp[1][n];
    }
}
