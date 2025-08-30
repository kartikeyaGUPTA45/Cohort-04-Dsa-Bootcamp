
class Solution {
    public int mySqrt(int x) {
        if (x == 0) return x;

        long low = 1;
        long high = x;
        long ans = -1;

        while(low <= high) {
            long mid = (low + high)/2;
            long sqr = mid*mid;

            if (sqr == (long)x) {
                return (int)mid;
            } else  if (sqr > (long)x) {
                high = mid-1;
            } else {
                ans = mid;
                low = mid+1;
            }
        }

        return (int)ans;


    }
}
