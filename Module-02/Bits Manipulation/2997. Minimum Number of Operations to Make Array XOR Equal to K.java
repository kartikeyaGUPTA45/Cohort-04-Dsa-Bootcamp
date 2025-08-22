
class Solution {

    private int csb(int n) {
        int ans = 0;
        while(n > 0) {
            ans += 1;
            n = (n&(n-1));
        }

        return ans;
    }

    public int minOperations(int[] nums, int k) {
        int xor = 0;
        for(int ele:nums) {
            xor ^= ele;
        }
        xor^=k;
        return csb(xor);
    }
}
