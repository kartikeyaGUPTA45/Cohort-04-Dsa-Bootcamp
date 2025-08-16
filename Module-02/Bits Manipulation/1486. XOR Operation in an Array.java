
class Solution {
    public int xorOperation(int n, int start) {
        int ans = start;
        for(int i=2;i<=n;i++) {
            start +=2;
            ans ^= start;
        }

        return ans;
    }
}
