/*
Scenario 6: Merge — Combining Two Sorted Log Streams

Question:
Two microservices each produce a stream of timestamped log entries, modeled as singly linked lists,  
and each stream is already sorted by timestamp internally.  
A monitoring dashboard needs a single, fully time-ordered feed combining both streams for display.

Task:
Given the heads of two sorted linked lists of log entries (sorted by timestamp),  
merge them into one sorted linked list, reusing the existing nodes.

*/

class Node {
    int val;   // timestamp of log entry
    Node next;
    Node(int v) {
        this.val = v;
        this.next = null;
    }
}

class LogMerger {
    Node mergeLogStreams(Node a, Node b) {
        Node dummy = new Node(0); // placeholder node
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        // attach remaining nodes
        tail.next = (a != null) ? a : b;

        return dummy.next; // merged sorted list
    }
}
