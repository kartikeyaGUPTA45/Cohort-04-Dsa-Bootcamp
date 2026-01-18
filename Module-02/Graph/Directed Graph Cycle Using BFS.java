//Problem Link: https://www.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1

//Code: 
class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<V;i++) {
            adj.add(new ArrayList<>());
        }
        
        int indegree[] = new int[V];
        
        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
            indegree[v]+=1;
        }
        
        
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        
        for(int i=0;i<V;i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }
        
        while(q.size() > 0) {
            int node = q.remove();
            
            count+=1;
            
            for(int nbr : adj.get(node)) {
                indegree[nbr]-=1;
                if (indegree[nbr] == 0) {
                    q.add(nbr);
                }
            }
        }
        
        return (count == V) ? false : true;
        
        
        
    }
}
