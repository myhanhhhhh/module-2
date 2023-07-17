package ss11.practice.queue;

import ss0_demo.Person;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }

    public MyLinkedListQueue() {

    }

    public void emqueue(int key) {
        Node temp = new Node(key);
        if ((this.tail) == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue() {
        if (this.head == null) {
            Node temp = this.head;
            this.head = this.head.next;
            if (this.head == null) {
                this.tail = null;
                return temp;
            }
        }
        return null;
    }
}
