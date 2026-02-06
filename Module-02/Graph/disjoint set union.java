class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();

    public DisjointSet(int n) {
        for(int i=0;i<=n;i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    public int findPar(int node) {
        if (node == parent.get(node)) {
            return node;
        }

        int ulp = findPar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }

    public void unionByRank(int u, int v) {
        int ulp_u = findPar(u);
        int ulp_v = findPar(v);

        if (ulp_u == ulp_v) {
            // do nothing
            return;
        } else if (rank.get(ulp_u) < rank.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
        } else if (rank.get(ulp_u) > rank.get(ulp_v)) {
            parent.set(ulp_v, ulp_u);
        } else {
            parent.set(ulp_v, ulp_u);
            int rankU = rank.get(ulp_u);
            rank.set(ulp_u, rankU+1);
        }
    }

    public void unionBySize(int u, int v) {
        int ulp_u = findPar(u);
        int ulp_v = findPar(v);

        if (ulp_u == ulp_v) {
            // do nothing
            return;
        } else if (size.get(ulp_u) < rank.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
        } else {
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_v) + size.get(ulp_u));
        }
    }
}

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        DisjointSet ds = new DisjointSet(V);

        for(int i=0;i<V;i++) {
            for(int j=0;j<V;j++) {
                if (isConnected[i][j] == 1) {
                    ds.unionBySize(i, j);
                }
            }
        }

        int ans = 0;
        List<Integer> parent = ds.parent;
        for(int i=0;i<V;i++) {
            if (i == parent.get(i)) {
                ans+=1;
            }
        }

        return ans;
    }
}
