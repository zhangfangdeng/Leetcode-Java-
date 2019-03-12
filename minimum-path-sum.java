class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int [][] minPath = new int[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 && j == 0)
                    minPath[i][j] = grid[i][j];
                else if(i == 0)
                    minPath[i][j] = minPath[i][j-1] + grid[i][j];
                else if(j == 0)
                    minPath[i][j] = minPath[i-1][j] + grid[i][j];
                else
                    minPath[i][j] = Math.min(minPath[i-1][j] + grid[i][j], minPath[i][j-1] + grid[i][j]);
            }
        }
        return minPath[n-1][m-1];
    }
}
