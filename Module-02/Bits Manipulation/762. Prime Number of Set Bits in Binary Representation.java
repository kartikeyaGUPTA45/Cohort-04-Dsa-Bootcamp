
class Solution {

    public boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for(int i=2;i*i<=n;i++) {
            if (n%i == 0) {
                return false;
            }
        }

        return true;
    }

    public int countSetBits(int n) {
        int ans = 0; 
        for(int i=0;i<32;i++) {
            ans += ((n>>i)&1);
        }
        return ans;
    }
    
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for(int i=left;i<=right;i++) {
            int cntSB = countSetBits(i);
            if (isPrime(cntSB)) {
                ans+=1;
            }
        }

        return ans;
    }
}
