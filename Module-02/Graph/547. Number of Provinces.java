class Solution {

    private void dfs(int node, int vis[], List<List<Integer>> adj) {
        vis[node] = 1;

        for(int nbr : adj.get(node)) {
            if (vis[nbr] == 0) {
                dfs(nbr, vis, adj);
            }
        }
    }

    private void bfs(int node, int vis[], List<List<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        vis[node] = 1;

        while(q.size() > 0) {
            node = q.remove();

            for(int nbr : adj.get(node)) {
                if (vis[nbr] == 0) {
                    vis[nbr] = 1;
                    q.add(nbr);
                }
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int N = isConnected.length;

        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<N;i++) {
            adj.add(new ArrayList<>());
        }

        for(int i =0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if (i != j && isConnected[i][j] == 1) {
                    adj.get(i).add(j);
                }
            }
        }

        int ans = 0;
        int vis[] = new int[N];

        for(int i=0;i<N;i++) {
            if (vis[i] == 0) {
                ans+=1;
                // dfs(i, vis, adj);
                bfs(i, vis, adj);
            }
        }

        return ans;
    }
}
