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
    public int removeStones(int[][] stones) {
        int m = 0, n = 0;

        for(int stone[] : stones) {
            m = Math.max(stone[0], m);
            n = Math.max(stone[1], n);
        }

        m+=1;
        n+=1;

        DisjointSet ds = new DisjointSet(n+m);

        for(int stone[] : stones) {
            int u = stone[0];
            int v = stone[1] + m;
            ds.unionBySize(u,v);
        }

        int cnt = 0;

        List<Integer> par = ds.parent;
        List<Integer> size = ds.size;

        for(int i=0;i<par.size();i++) {
            if (i == par.get(i) && size.get(i) > 1) {
                cnt+=1;
            }
        }

        return stones.length - cnt;
    }
}
