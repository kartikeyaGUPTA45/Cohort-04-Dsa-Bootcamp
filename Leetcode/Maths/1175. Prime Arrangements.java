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

    private int factorial(int n, int mod) {
        int ans = 1;
        for(int i=2;i<=n;i++) {
            ans = (ans*i)%mod;
        }

        return ans;
    }

    public int numPrimeArrangements(int n) {
        int cntPrime = primeSieve(n);
        int cntNonPrime = n - cntPrime;
        int mod = 1000000007;

        int x = factorial(cntPrime, mod);
        int y = factorial(cntNonPrime, mod);

        return (x*y)%mod;
    }
}
