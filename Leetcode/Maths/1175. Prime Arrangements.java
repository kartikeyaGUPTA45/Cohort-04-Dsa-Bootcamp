class Solution {
    private int primeSieve(int n) {
        boolean arr[] = new boolean[n+1];
        Arrays.fill(arr,true);

        arr[0] = false;
        arr[1] = false;

        for(int i=2;i*i<=n;i++) {
            if (arr[i] == true) {
                for(int j = i*i;j<=n;j+=i) {
                    arr[j] = false;
                }
            }
        }

        int cnt = 0;
        for(int i=2;i<=n;i++) {
            if (arr[i] == true) {
                cnt+=1;
            }
        }

        return cnt;
    }

    private long factorial(int n, long mod) {
        long ans = 1;
        for(int i=2;i<=n;i++) {
            ans = (ans*i)%mod;
        }

        return ans;
    }

    public int numPrimeArrangements(int n) {
        int cntPrime = primeSieve(n);
        int cntNonPrime = n - cntPrime;
        long mod = 1000000007;

        long x = factorial(cntPrime, mod);
        long y = factorial(cntNonPrime, mod);

        return (int)((x*y)%mod);
    }
}
