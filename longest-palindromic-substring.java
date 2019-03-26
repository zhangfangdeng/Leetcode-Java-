// dp
class Solution1 {
    public String longestPalindrome(String s) {
        if(s.equals("") || s.length() == 1)
            return s;
        int n = s.length();
        int[][] dp = new int[n][n];
        int max = 0;
        int q = 0, p = 0;
        
        for(int i = 0; l < n; i++){
            int x = 0;
            int y = x + i;
            while(x < n - i && y < n){
                if(x == y)
                    dp[x][y] = 1;
                else if(s.charAt(x) == s.charAt(y)){
                    if(dp[x + 1][y - 1] = y - x - 1)
                        dp[x][y] = y - x + 1;
                    else
                        dp[x][y] = Math.max(dp[x+1][y], dp[x][y-1]);
                }
                else
                    dp[x][y] = Math.max(dp[x+1][y], dp[x][y-1]);
                
                if(dp[x][y] > max){
                    max = dp[x][y];
                    p = x;
                    q = y;
                }
                x++;
                y++;
            }
        }
        return s.substring(p,q+1);
    }
}
