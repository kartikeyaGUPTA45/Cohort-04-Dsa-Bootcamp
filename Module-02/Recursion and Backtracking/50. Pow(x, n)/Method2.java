class Solution {
    public double myPow(double x, int n) {
        long N = n;

        if (N < 0) {
            N *=-1;
            x = 1/x;
        }

        return helper(x, N);
    }

    public double helper(double x, long n) {
        if (n == 0) {
            return 1;
        }

        double subAns = helper(x, n/2);

        if (n%2 == 0) {
            return subAns * subAns;
        } else {
            return subAns * subAns * x;
        }

    }
}
