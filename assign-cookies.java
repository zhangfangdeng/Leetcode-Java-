//先排序，再贪心
class Solution{
    public int findContentChildren(int[] g, int[] s){
        if(s.length == 0 || g.length == 0)
            return 0;
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        int child = 0;
        int cookie = 0;
        
        while(child < g.length && cookie < s.length){
            if(g[child] <= s[cookie])
                child++;
            cookie++;
        }
        return child;
    }
}
