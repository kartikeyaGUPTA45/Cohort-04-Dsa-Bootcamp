//Problem Link: https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1

//Code: 

class Solution {
    
    private void dfs_helper(int node, int vis[], ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;
        ans.add(node);
        
        for(int nbr : adj.get(node)) {
            if (vis[nbr] == 0) {
                dfs_helper(nbr, vis, ans, adj);
            }
        }
    }
    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int N = adj.size();
        int vis[] = new int[N];
        
        ArrayList<Integer> ans = new ArrayList<>();
        dfs_helper(0, vis, ans, adj);
        return ans;
    }
}
