package org.example.queue;

public class Queue {

    private Node first;
    private Node last;
    int lenght;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        lenght = 1;
    }

    public void printStack() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }
}
