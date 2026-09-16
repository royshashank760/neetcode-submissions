class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        // Put all stones into max heap
        for (int stone : stones) {
            pq.add(stone);
        }

        // Keep smashing two largest stones
        while (pq.size() > 1) {

            int y = pq.poll(); // largest
            int x = pq.poll(); // second largest

            if (y != x) {
                pq.add(y - x);
            }
        }

        // If heap is empty, return 0
        return pq.isEmpty() ? 0 : pq.peek();
    }
}