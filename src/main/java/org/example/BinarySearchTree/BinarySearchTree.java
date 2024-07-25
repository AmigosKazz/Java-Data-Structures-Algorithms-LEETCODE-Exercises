package org.example.BinarySearchTree;

public class BinarySearchTree {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if(root == null)  root = newNode;

        Node temp = root;
        while (temp.left != null || temp.right != null) {
            if(newNode == temp) return false;
            if(newNode.value > temp.value) {
                temp = temp.right;
            } else if (newNode.value < temp.value){
                temp = temp.left;
            } else if(temp)
        }
        return false;
    }
}
