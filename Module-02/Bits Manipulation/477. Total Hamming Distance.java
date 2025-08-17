
class Solution {

    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i=0;i<32;i++) {
            int cSB = 0;
            for(int j=0;j<n;j++) {
                int N = nums[j];
                cSB += ((N>>i)&1);
            }

            int cUSB = n - cSB;
            ans += (cSB*cUSB);
        }

        return ans;
    }
}
