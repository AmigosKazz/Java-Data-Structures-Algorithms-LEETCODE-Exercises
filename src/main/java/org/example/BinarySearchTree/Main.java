package org.example.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBst = new BinarySearchTree();

        myBst.insert(17);
        myBst.insert(10);
        myBst.insert(25);
        myBst.insert(50);
        myBst.insert(41);
        myBst.insert(80);

        myBst.insert(15);
        System.out.println(myBst.contains(15));
        System.out.println(myBst.root.left.right.value);
    }
}
