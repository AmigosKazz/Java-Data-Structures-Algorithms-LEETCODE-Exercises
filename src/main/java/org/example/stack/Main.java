package org.example.stack;

public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack(4);
        myStack.push(2);
        myStack.push(5);
        myStack.pop();

        myStack.printStack();
    }

}
