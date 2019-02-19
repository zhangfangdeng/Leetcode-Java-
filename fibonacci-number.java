class Solution1 {
    public int fib(int N) {
        if(N <= 1)
            return N;
        return fib(N - 1) + fib(N - 2);
    }
}

class Solution2 {
    public int fib(int N) {
        if(N <= 1)
            return N;
        int[] m = new int[N+1];
        m[0] = 0;
        m[1] = 1;
        for(int i = 2; i <= N; i++)
            m[i] = m[i - 1] + m[i - 2];
        return m[N];
    }
}
