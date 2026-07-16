/*
Scenario 5: Cycle Detection — Catching an Infinite Redirect Loop

Question:
A URL shortening service represents a chain of redirects as a singly linked list,  
where each node's next points to the URL it redirects to.  
A misconfiguration can accidentally create a redirect loop (URL A redirects to B,  
which eventually redirects back to A), which would cause a browser to hang.  
The team wants a way to detect this before it reaches a user.

Task:
Given the head of a redirect chain, determine whether it contains a cycle.

*/

class Node {
    String url;
    Node next;
    Node(String u) {
        this.url = u;
        this.next = null;
    }
}

class RedirectChain {
    boolean hasRedirectLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;       // slow moves 1 step
            fast = fast.next.next;  // fast moves 2 steps
            if (slow == fast) return true; // cycle detected
        }
        return false; // no cycle
    }
}
