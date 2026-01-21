class Solution {
    
    private boolean dfs(int node, int color[], List<List<Integer>> adj) {
        for(int nbr : adj.get(node)) {
            if (color[nbr] == -1) {
                color[nbr] = 1 - color[node];
                if (dfs(nbr, color, adj) == false) {
                    return false;
                }
            } else if (color[node] == color[nbr]) {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isBipartite(int V, int[][] edges) {
        // Code here
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<V;i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        // 0,1
        int color[] = new int[V];
        
        Arrays.fill(color , -1);
        
        for(int i=0;i<V;i++) {
            if (color[i] == -1) {
                color[i] = 0;
                if (dfs(i, color, adj) == false) {
                    return false;
                } 
            }
        }
        
        return true;
    }
}
