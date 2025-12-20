class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele : stones) pq.add(ele);

        while(pq.size() > 1) {
            int y = pq.poll();
            int x = pq.poll();

            if (y != x) {
                pq.add(y-x);
            }
        }

        return (pq.size() == 0) ? 0 : pq.poll();
    }
}
