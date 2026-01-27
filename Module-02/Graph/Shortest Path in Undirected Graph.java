// Problem Link: https://www.geeksforgeeks.org/problems/shortest-path-in-undirected-graph-having-unit-distance/1

//Code: 

class Solution {
    public int[] shortestPath(int V, int[][] edges, int src) {
        // code here
        List<List<Integer>> adjList = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<V;i++) {
            adjList.add(new ArrayList<>());
        }
        
        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        
        int dis[] = new int[V];
        Arrays.fill(dis, -1);
        dis[src] = 0;
        
        q.add(src);
        
        while(q.size() > 0) {
            int node = q.remove();
            
            for(int nbr : adjList.get(node)) {
                if (dis[nbr] == -1) {
                    dis[nbr] = dis[node] + 1;
                    q.add(nbr);
                }
            }
        }
        
        return dis;
    }
}
