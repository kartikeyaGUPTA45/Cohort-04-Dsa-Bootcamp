class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele: amount) pq.add(ele);

        int ans = 0;
        while(pq.peek() != 0) {
            int cup1 = pq.poll();
            int cup2 = pq.poll();

            ans += 1;

            pq.add(cup1-1);
            pq.add(cup2-1);
        }

        return ans;
    }
}
