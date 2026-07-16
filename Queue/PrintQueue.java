package Queue;

import java.util.*;

class PrintQueue {
    private Deque<Integer> printQueue = new ArrayDeque<>();

    void submitJob(int jobId) {
        printQueue.addLast(jobId); // normal job
    }

    void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId); // urgent job
    }

    int printNextJob() {
        if (printQueue.isEmpty()) throw new RuntimeException("No jobs");
        return printQueue.removeFirst();
    }
}
