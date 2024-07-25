package org.example.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(6);
        myQueue.enqueue(8);
        myQueue.enqueue(10);

        myQueue.printStack();

        myQueue.dequeue();
        System.out.println("...");
        myQueue.printStack();
    }

}
