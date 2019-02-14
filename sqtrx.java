class Solution {
    public int mySqrt(int x) {
        if(x == 0)
            return 0;
        int ans = -1;
        int left = 1;
        int right = x;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(mid <= x / mid){
                left = mid + 1;
                ans = mid;
            }
            else{
                right = mid - 1;
            }
        }
        return ans;
    }
}
