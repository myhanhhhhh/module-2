package ss11.practice.queue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.emqueue(10);
        queue.emqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.emqueue(30);
        queue.emqueue(40);
        queue.emqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }

}
