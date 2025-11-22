Link: https://www.geeksforgeeks.org/problems/printing-longest-increasing-subsequence/1


Code: 

class Solution {
    
    private ArrayList<Integer> lis_algo(int nums[]) {
        int n = nums.length;
        int dp[] = new int[n];
        int parent[] = new int[n];
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.fill(dp, 1);
        Arrays.fill(parent, -1);
        int ans = 1;
        int lastIdx = 0;

        for(int idx = 0; idx < n;idx++) {
            for(int prev = 0;prev<idx;prev++) {
                if (nums[idx] > nums[prev] && (dp[prev] + 1 > dp[idx])) {
                    dp[idx] = dp[prev]+1;
                    parent[idx] = prev;
                }
            }
            
            if (ans < dp[idx]) {
                ans = dp[idx];
                lastIdx = idx;
            }
        }
        
        while(lastIdx != -1) {
            list.add(nums[lastIdx]);
            lastIdx = parent[lastIdx];
        }
            
        Collections.reverse(list);    

        return list;
    }
    
    
    
    public ArrayList<Integer> getLIS(int arr[]) {
        // Code here
        return lis_algo(arr);
    }
}
