//Problem Link: https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

//Code: 
class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int N = adj.size();
        
        int vis[] = new int[N];
        ArrayList<Integer> ans = new ArrayList<>();
        
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        
        vis[0] = 1;
        
        while(q.size() > 0) {
            int node = q.remove();
            ans.add(node);
            
            for(int nbr : adj.get(node)) {
                if (vis[nbr] == 0) {
                    vis[nbr] = 1;
                    q.add(nbr);
                }
            }
        }
        
        return ans;
    }
}
