class Solution {
    public int minFallingPathSum(int[][] A) {
        if(A == null || A.length == 0 || A[0].length == 0)
            return 0;
        for(int i = 1; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                A[i][j] += getMin(A, i, j);
            }
        }
        int res = Integer.MAX_VALUE;
        for(int j = 0; j < A[0].length; j++){
            if(A[A.length-1][j] < res)
                res = A[A.length-1][j];
        }
        return res;
    }
    public int getMin(int[][] A, int i, int j){
        int min = Integer.MAX_VALUE;
        if(j > 0)
            min = Math.min(min, A[i-1][j-1]);
        if(j < A.length - 1)
            min = Math.min(min, A[i-1][j+1]);
        min = Math.min(min, A[i-1][j]);
        return min;
    }
}
