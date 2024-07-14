package org.example.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList mylinkedList = new LinkedList(4);

        mylinkedList.append(7);
        mylinkedList.prepend(9);
        System.out.println(mylinkedList.get(1).value+ "\n");

        mylinkedList.printList();


    }
}
