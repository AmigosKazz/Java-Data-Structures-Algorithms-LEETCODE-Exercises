package org.example.LinkedList;

public class    Main {
    public static void main(String[] args) {
        LinkedList mylinkedList = new LinkedList(4);

        mylinkedList.append(7);
        mylinkedList.append(5);
        mylinkedList.prepend(9);
        mylinkedList.insert(2, 3);

        System.out.println("middle is: "+mylinkedList.findMiddleNode().value);

        mylinkedList.printList();
    }
}
