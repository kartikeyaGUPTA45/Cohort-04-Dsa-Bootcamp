//Problem link: https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1

//Code:

class Pair {
    int node;
    int par;
    
    public Pair(int node, int par) {
        this.node = node;
        this.par = par;
    }
}

class Solution {
    
    private boolean bfs(int node, int vis[], List<List<Integer>> adj) {
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(node, -1));
        vis[node] = 1;
        
        
        while(q.size() > 0) {
            Pair p = q.remove();
            
            node = p.node;
            int par = p.par;
            
            for(int nbr : adj.get(node)) {
                if (vis[nbr] == 0) {
                    vis[nbr] = 1;
                    q.add(new Pair(nbr, node));
                } else if (nbr != par) {
                    return true;
                }
            }
        }
        
        return false;
    } 
    
    private boolean dfs(int node, int par, int vis[], List<List<Integer>> adj) {
        vis[node] = 1;
        
        for(int nbr : adj.get(node)) {
            if (vis[nbr] == 0) {
                if (dfs(nbr, node, vis, adj) == true) {
                    return true;
                }
            } else if (nbr != par) {
                return true;
            }
        }
        
        return false;
    }
    
    public boolean isCycle(int V, int[][] edges) {
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
        
        int vis[] = new int[V];
        
        for(int i=0;i<V;i++) {
            if (vis[i] == 0) {
                // if (dfs(i, -1, vis, adj) == true) {
                //     return true;
                // }   
                
                if (bfs(i, vis, adj) == true) {
                    return true;
                }
            }
        }
        
        
        return false;
        
    }
}
