package org.example.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList mylinkedList = new LinkedList(4);

        mylinkedList.append(7);
        mylinkedList.printList();
        mylinkedList.removeLast();
        mylinkedList.printList();
    }
}
