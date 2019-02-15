//摘自ping@CoderYQ:
//不可将A数组遍历得到sumA，与K做加法得到和，原因：A数组的长度可能很长，整数越界；
//将K与A倒叙的每个元素x相加得到和，将和取模得到每个元素，插入到新数组中
class Solution{
    public List<Integer> addToArrayForm(int[] A, int K){
        List<Integer> result = new ArrayList<>();
        for(int i = A.length - 1; i >= 0; i--){
            if(K == 0)
                result.add(0,A[i]);
            else{
                K += A[i];
                int remind = K % 10;
                result.add(0, remind);
                K /= 10;
            }
        }
        if(K != 0){
            while(K > 9){
                int remind = K % 10;
                result.add(0, remind);
                K /= 10;
            }
            result.add(0, K);
        }
        return result;
    }
}
