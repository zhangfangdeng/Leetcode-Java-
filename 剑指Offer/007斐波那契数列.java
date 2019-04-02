public class Solution {
    public int Fibonacci(int n) {
        if(n <= 1)
            return n;
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        int i = 2;
        while(i <= n){
            fib[i] = fib[i - 2] + fib[i - 1];
            i++;
        }
        return fib[n];
    }
}
