class Solution {
    public boolean canEatBananas(int piles[], int n, int mid, int h) {
        int hrs = 0;

        for(int i=0;i<n;i++) {
            hrs += Math.ceil((double)piles[i]/mid);
        }

        return hrs <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];
        int n = piles.length;
        int ans = 0;

        for(int i=1; i<n;i++) {
            high = Math.max(high, piles[i]);
        }

        while(low <= high) {
            int mid = low + (high-low)/2;

            if (canEatBananas(piles, n, mid, h)) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return ans;
    }
}
