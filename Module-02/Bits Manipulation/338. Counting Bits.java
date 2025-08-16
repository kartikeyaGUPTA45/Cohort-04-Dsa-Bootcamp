
class Solution {
    public int countSetBits(int n) {
        int ans = 0; 
        while(n != 0) {
            ans += 1;
            n = (n&(n-1));
        }
        return ans;
    }

    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=1;i<=n;i++) {
            ans[i] = countSetBits(i);
        }

        return ans;
    }
}
