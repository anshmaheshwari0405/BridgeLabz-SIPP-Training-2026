import java.util.*;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

class ERSystem {
    PriorityQueue<Patient> triageQueue = new PriorityQueue<>((a, b) -> b.severity - a.severity); 

    void addPatient(Patient p) {
        triageQueue.offer(p); 
    }

    Patient treatNext() {
        return triageQueue.poll();
    }

    Patient peekNext() {
        return triageQueue.peek(); 
    }
}