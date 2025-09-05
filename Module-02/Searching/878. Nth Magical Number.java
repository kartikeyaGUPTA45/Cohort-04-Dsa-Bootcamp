
class Solution {

    public long gcd(long A, long B) {
        if (B == 0) {
            return A;
        }

        return gcd(B, A%B);
    }

    public int nthMagicalNumber(int n, int a, int b) {
        long A = a;
        long B = b;
        long N = n;

        long low = Math.min(A,B);
        long high = N*Math.min(A,B);
        long lcm = (A*B)/gcd(A,B);
        long ans = 0;

        while(low <= high) {
            long mid = low + (high - low)/2;

            long cntMagicalNumberTillMid = (mid/A) + (mid/B) - (mid/lcm);

            if(N == cntMagicalNumberTillMid) {
                ans = mid;
                high = mid-1;
            } else if (N > cntMagicalNumberTillMid) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return (int)(ans % 1000000007);
    }
}
