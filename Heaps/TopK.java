import java.util.*;

class TopK {
    List<Integer> topKLargest(int[] transactions, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int amount : transactions) {
            if (minHeap.size() < k) {
                minHeap.offer(amount);
            }
            else if (amount > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(amount);
            }

        }
        return new ArrayList<>(minHeap);
    }
}