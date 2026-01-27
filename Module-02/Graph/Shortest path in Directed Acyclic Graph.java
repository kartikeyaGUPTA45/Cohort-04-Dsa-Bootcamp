//Problem Link: https://www.geeksforgeeks.org/problems/shortest-path-in-undirected-graph/1

//Code: 
// User function Template for Java
class Pair {
    int u;
    int wt;
    
    public Pair(int u, int wt) {
        this.u = u;
        this.wt = wt;
    }
}

class Solution {
    
    private void dfs(int node, int vis[], List<List<Pair>>adjList, Stack<Integer>st) {
        vis[node] = 1;
        
        for(Pair p : adjList.get(node)) {
            if (vis[p.u] == 0) {
                dfs(p.u, vis, adjList, st);
            }
        }
        
        st.push(node);
    }

    public int[] shortestPath(int V, int E, int[][] edges) {
        // Code here
        
        List<List<Pair>> adjList = new ArrayList<>();
        
        for(int i=0;i<V;i++) {
            adjList.add(new ArrayList<>());
        }
        
        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            
            adjList.get(u).add(new Pair(v, wt));
        }
        
        Stack<Integer> st = new Stack<>();
        int vis[] = new int[V];
        
        dfs(0, vis, adjList, st);
        
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        dist[0] = 0;
        
        while(st.size() > 0) {
            int node = st.pop();
            
            for(Pair nbr : adjList.get(node)) {
                int u = nbr.u;
                int wt = nbr.wt;
                
                if (dist[u] > dist[node] + wt) {
                    dist[u] = dist[node] + wt;
                }
            }
        }
        
        for(int i=0;i<V;i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                dist[i] = -1;
            }
        }
        
        return dist;
    }
}
