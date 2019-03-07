//解题思路:假设n个节点存在二叉排序树的个数G(n) = G(0)*G(n-1)+...+G(n-1)*G(0)
class Solution1 {
    public int numTrees(int n) {
        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 0;
        
        for (int i = 2; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                nums[i] = nums[i] + nums[j] * nums[i - j - 1];
            }
        }
        return nums[n];
    }
}


//迭代
class Solution2 {
    public int numTrees(int n) {
        int count = 0;
        if(n < 2)
            return 1;
        if(n == 2)
            return n;
        for(int i = 0; i < n; i++) {
            count += numTrees(i) * numTrees(n - i - 1);
        }
        return count;
    }
}
