
class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length;

        int first = 0;
        for(int i=1;i<=(n+1);i++) {
            first^=i;
        }

        for(int i=1;i<n;i+=2) {
            first ^= encoded[i];
        }

        int perm[] = new int[n+1];
        perm[0] = first;

        for(int i=0;i<n;i++) {
            perm[i+1] = encoded[i]^perm[i];
        }

        return perm;
    }
}


