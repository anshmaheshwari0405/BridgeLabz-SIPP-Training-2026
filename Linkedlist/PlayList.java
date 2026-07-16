/* 
Scenario 1: Insertion — Adding a Track to a Playlist Queue

Question:
A music streaming app models a user's play queue as a singly linked list of tracks.  
The user wants to insert a newly chosen track immediately after the track that's currently playing,  
without disturbing the rest of the queue.

Task:
Given a reference to the node representing the currently playing track,  
insert a new track node immediately after it.

*/

class Node {
    int trackId;
    Node next;
    Node(int id) {
        this.trackId = id;
        this.next = null;
    }
}

class Playlist {
    void insertAfter(Node current, int trackId) {
        Node newNode = new Node(trackId);
        newNode.next = current.next; // capture rest of queue first
        current.next = newNode;      // link current to new track
    }
}
