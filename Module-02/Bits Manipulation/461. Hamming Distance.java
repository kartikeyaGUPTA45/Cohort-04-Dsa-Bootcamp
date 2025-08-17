class Solution {
    public int countSetBits(int num) {
        int ans = 0;
        while(num != 0) {
            ans += 1;
            num = (num & (num-1));
        }

        return ans;
    }

    public int hammingDistance(int x, int y) {
        int num = x^y;
        return countSetBits(num);
    }
}
