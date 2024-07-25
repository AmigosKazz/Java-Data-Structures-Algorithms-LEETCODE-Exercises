package org.example.queue;

public class Queue {
    private Node first;
    private Node last;
    int length;

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
        length = 1;
    }

    public void printStack() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last = newNode;
        }

        last.next = newNode;
        last = newNode;
        length++;
    }

    public Node dequeue() {
        Node temp = first;
        if (length == 0) return null;
        if (length == 1) {
            first = null;
            last = null;
        }

        first = first.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void getFirst() {
        System.out.println("First: " + first.value);
    }
    public void getLast() {
        System.out.println("Last: " + last.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}