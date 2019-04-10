class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if(A .length == 0 || A == null)
            return 0;
        int res = 0;
        int sum = 0;
        Map<Integer, Integer> mapAB = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                sum = A[i] + B[j];
                if(mapAB.containsKey(sum))
                    mapAB.put(sum, mapAB.get(sum)+1);
                else
                    mapAB.put(sum, 1);
            }
        }
        
        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < D.length; j++){
                sum = C[i] + D[j];
                if(mapAB.containsKey(-1*sum))
                    res += mapAB.get(-1*sum);
            }
        }
        return res;
    }
}
