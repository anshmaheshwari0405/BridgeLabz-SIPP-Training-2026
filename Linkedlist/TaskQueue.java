/*
Scenario 2: Deletion — Removing a Completed Task from a Task Queue

Question:
A background job processor keeps pending tasks in a singly linked list, in the order they should run.  
Once a task completes, it needs to be removed from the queue so processing continues with the next pending task.

Task:
Given the head of the task queue and the ID of a completed task, remove the node with that ID from the queue  
and return the (possibly updated) head.

*/

class Node {
    int val;
    Node next;
    Node(int v) {
        this.val = v;
        this.next = null;
    }
}

class TaskQueue {
    Node removeTask(Node head, int taskId) {
        if (head == null) return null;

        // Case 1: removing the very first task
        if (head.val == taskId) return head.next;

        // Case 2: removing task further along
        Node prev = head, curr = head.next;
        while (curr != null && curr.val != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }
}
