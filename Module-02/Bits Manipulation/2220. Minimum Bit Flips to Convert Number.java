class Solution {

    public int countSetBits(int n) {
        int ans = 0;
        while(n != 0) {
            ans +=1;
            n = (n&(n-1));
        }

        return ans;
    }

    public int minBitFlips(int start, int goal) {
        int num = start ^ goal;
        return countSetBits(num);
    }
}
