package org.example.hashTable;

public class Main {
    public static void main(String[] args) {
        HashTable myhashTable = new HashTable();

        myhashTable.set("kazz", 6);
        myhashTable.set("Hash table", 9);
        myhashTable.set("henimbola", 10);

        myhashTable.printTable();
    }
}
