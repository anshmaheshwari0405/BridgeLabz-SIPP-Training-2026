/*
Scenario 4: Find the Middle — Picking a Midpoint Server in a Relay Chain

Question:
A set of servers is chained together for a message relay system, modeled as a singly linked list  
(each server knows only the next server in the chain). For a maintenance operation, the ops team  
needs to identify the server sitting at the midpoint of the chain, without first counting the total number of servers.

Task:
Given the head of the server chain, return the middle server node in a single pass.


*/

class Node {
    int serverId;
    Node next;
    Node(int id) {
        this.serverId = id;
        this.next = null;
    }
}

class RelayChain {
    Node findMiddleServer(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;       // slow moves 1 step
            fast = fast.next.next;  // fast moves 2 steps
        }
        return slow; // midpoint server
    }
}
