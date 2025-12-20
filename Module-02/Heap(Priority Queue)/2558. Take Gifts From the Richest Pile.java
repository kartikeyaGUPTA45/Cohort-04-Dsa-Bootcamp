class Solution {
    public long pickGifts(int[] gifts, int k) {
        long ans = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : gifts) {
            pq.add(ele);
        }

        while (k > 0) {
            int gift = pq.poll();
            gift = (int)(Math.sqrt(gift));
            pq.add(gift);
            k-=1;
        }

        while(pq.size() > 0) {
            ans += pq.poll();
        }

        return ans;
    }
}
