/*
Scenario 3: Reverse — Reversing a Browser Back-Button History Stack

Question:
A browser's page history is modeled as a singly linked list, most-recent page first.  
A new "replay history forward" feature needs the entire history reversed,  
so the oldest visited page becomes first and the most recently visited becomes last.

Task:
Given the head of the history list, reverse it in place and return the new head.

*/

class Node {
    String page;
    Node next;
    Node(String p) {
        this.page = p;
        this.next = null;
    }
}

class BrowserHistory {
    Node reverseHistory(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next; // step 1: save next
            curr.next = prev;      // step 2: reverse link
            prev = curr;           // step 3: advance prev
            curr = next;           // step 4: advance curr
        }
        return prev; // new head (oldest page first)
    }
}
