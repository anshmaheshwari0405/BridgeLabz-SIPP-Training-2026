package Queue;

import java.util.*;

class Patient {
    int priority;
    String name;
    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

class ERQueue {
    private PriorityQueue<Patient> triageQueue =
        new PriorityQueue<>((a, b) -> a.priority - b.priority); // min-heap

    void admitPatient(Patient p) {
        triageQueue.offer(p);
    }

    Patient callNextPatient() {
        if (triageQueue.isEmpty()) throw new RuntimeException("No patients");
        return triageQueue.poll();
    }

    Patient peekNextPatient() {
        return triageQueue.peek();
    }
}

