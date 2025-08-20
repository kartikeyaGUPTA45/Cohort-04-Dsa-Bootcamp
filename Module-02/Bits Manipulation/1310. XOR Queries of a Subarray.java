class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int prefixXor[] = new int[n];
        prefixXor[0] = arr[0];

        for(int i=1;i<n;i++) {
            prefixXor[i]= prefixXor[i-1] ^ arr[i];
        }

        int q = queries.length;
        int ans [] = new int[q];

        for(int i=0;i<q;i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            if (start == 0) {
                ans[i] = prefixXor[end];
            } else {
                ans[i] = prefixXor[end] ^ prefixXor[start-1];
            }
        }

        return ans;
        
    }
}
