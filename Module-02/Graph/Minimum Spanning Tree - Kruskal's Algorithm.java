//Problem Link: https://www.geeksforgeeks.org/problems/minimum-spanning-tree-kruskals-algorithm/1

//Code: 

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


// User function Template for Java
class Solution {
    static int kruskalsMST(int V, int[][] edges) {
        // code here
        Arrays.sort(edges, (a,b) -> a[2] - b[2]);
        
        int sum = 0;
        DisjointSet ds = new DisjointSet(V);
        
        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            
            int ulp_u = ds.findPar(u);
            int ulp_v = ds.findPar(v);
            
            if (ulp_u != ulp_v) {
                ds.unionBySize(u, v);
                sum += wt;
            }
        }
        
        return sum;
    }
}
