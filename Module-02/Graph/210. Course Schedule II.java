class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int indegree[] = new int[numCourses];
        int ans[] = new int[numCourses];

        for(int i=0;i<numCourses;i++) {
            adj.add(new ArrayList<>());
        }

        for(int pre[] : prerequisites) {
            int v = pre[0];
            int u = pre[1];

            adj.get(u).add(v);
            indegree[v]+=1;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<numCourses;i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }

        int count = 0;

        while(q.size() > 0) {
            int node = q.remove();
            ans[count] = node;
            count+=1;


            for(int nbr : adj.get(node)) {
                indegree[nbr]-=1;

                if (indegree[nbr] == 0) {
                    q.add(nbr);
                }
            }
        }

        if (count != numCourses) {
            return new int[0];
        }

        return ans;
    }
}
