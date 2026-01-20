//Problem Link: https://www.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1

//Code: 

class Solution {
    
    private boolean dfs(int node, int vis[], int pathVis[], List<List<Integer>> adj) {
        vis[node] = 1;
        pathVis[node] = 1;
        
        for(int nbr : adj.get(node)) {
            if (vis[nbr] == 0) {
                if (dfs(nbr, vis, pathVis, adj) == true) {
                    return true;
                } 
            } else if (pathVis[nbr] != 0) {
                    return true;
            }
        }
        
        pathVis[node] = 0;
        return false;
    }
    
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<V;i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
        }
        
        int vis[] = new int[V];
        int pathVis[] = new int[V];
        
        for(int i=0;i<V;i++) {
            if (vis[i] == 0) {
                if (dfs(i, vis, pathVis, adj) == true) {
                    return true;
                }
            }
        }
        
        return false;
        
    }
}
