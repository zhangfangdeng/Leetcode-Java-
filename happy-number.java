class Solution{
    public boolean isHappy(int n){
        int temp = 0;
        while(n != 1){
            if(n == 4 || n == 37 || n == 89 || n == 42)
                return false;
            while(n > 0){
                temp += (n % 10) * (n % 10);
                n /= 10;
            }
            n = temp;
            temp = 0;
        }
        return true;
    }
}
