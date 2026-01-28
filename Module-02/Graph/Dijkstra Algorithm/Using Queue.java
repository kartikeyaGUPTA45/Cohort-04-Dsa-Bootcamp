//Problem Link: https://www.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1

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
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        List<List<Pair>> adjList = new ArrayList<>();
        
        for(int i=0;i<V;i++) {
            adjList.add(new ArrayList<>());
        }
        
        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            
            adjList.get(u).add(new Pair(v, wt));
            adjList.get(v).add(new Pair(u, wt));
        }
        
        Queue<Pair> q = new LinkedList<>();
        
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        dist[src] = 0;
        q.add(new Pair(src,0));
        
        while(q.size() > 0) {
            Pair p = q.remove();
            int node = p.v;
            int disToNode = p.wt;
            
            for(Pair nbr : adjList.get(node)) {
                if (dist[nbr.v] > dist[node] + nbr.wt) {
                    dist[nbr.v] = dist[node] + nbr.wt;
                    q.add(new Pair(nbr.v, dist[nbr.v]));
                }
            }
        }
        
        return dist;
        
    }
}
