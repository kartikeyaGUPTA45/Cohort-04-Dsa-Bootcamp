class Solution {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int subAns1 = fib(n-1);
        int subAns2 = fib(n-2);

        int ans = subAns1 + subAns2;
        return ans;
    }
}
