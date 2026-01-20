//Problem Link: https://www.geeksforgeeks.org/problems/bipartite-graph/1

//Code: 

class Solution {
    
    private boolean bfs(int node, int color[], List<List<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        
        color[node] = 0;
        // node = 0/1
        // nbr = 1/0;
        
        // color[nbr] = 1-color[node]
        // color[nbr] = 1-1 = 0;
        //color[nbr] = 1-0 = 1;
        while(q.size() > 0) {
            node = q.remove();
            
            for(int nbr : adj.get(node)) {
                if (color[nbr] == -1) {
                    color[nbr] = 1- color[node];
                    q.add(nbr);
                } else if (color[node] == color[nbr]) {
                    return false;
                }
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
                if (bfs(i, color, adj) == false) {
                    return false;
                } 
            }
        }
        
        return true;
    }
}
