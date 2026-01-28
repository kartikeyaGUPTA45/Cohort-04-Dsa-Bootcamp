//Problem Link: https://www.geeksforgeeks.org/problems/shortest-path-in-weighted-undirected-graph/1

//Code: 

class Pair {
    int v;
    int wt;
    
    public Pair(int v, int wt) {
        this.v = v;
        this.wt = wt;
    }
}

class Solution {
    
    public int[] dijkstra(int V, int[][] edges, int src, int par[]) {
        // code here
        List<List<Pair>> adjList = new ArrayList<>();
        
        for(int i=0;i<=V;i++) {
            adjList.add(new ArrayList<>());
        }
        
        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            
            adjList.get(u).add(new Pair(v, wt));
            adjList.get(v).add(new Pair(u, wt));
        }
        
        PriorityQueue<Pair> q = new PriorityQueue<>((x,y) -> x.wt - y.wt); // Sort in the increasing order of wt
        
        int dist[] = new int[V+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        dist[src] = 0;
        par[src] = src;
        q.add(new Pair(src,0));
        
        while(q.size() > 0) {
            Pair p = q.remove();
            int node = p.v;
            int disToNode = p.wt;
            
            for(Pair nbr : adjList.get(node)) {
                if (dist[nbr.v] > dist[node] + nbr.wt) {
                    dist[nbr.v] = dist[node] + nbr.wt;
                    par[nbr.v] = node;
                    q.add(new Pair(nbr.v, dist[nbr.v]));
                }
            }
        }
        
        return dist;
        
    }
    
    public List<Integer> shortestPath(int n, int m, int edges[][]) {
        //  Code Here.
        int par[] = new int[n+1];
        for(int i=1;i<=n;i++) {
            par[i] = i;
        }
        
        int dist[] = dijkstra(n, edges, 1, par);
        
        List<Integer> ans = new ArrayList<>();
        if (dist[n] == Integer.MAX_VALUE) {
            ans.add(-1);
            return ans;
        }
        
        int node = n;
        
        while(node != 1) {
            ans.add(node);
            node = par[node];
        }
        
        ans.add(1);
        ans.add(dist[n]);
        
        Collections.reverse(ans);
        return ans;
 
    }
}
