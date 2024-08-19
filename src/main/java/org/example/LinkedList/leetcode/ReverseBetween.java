package org.example.LinkedList.leetcode;

// 92. Reverse Linked List II

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode leftPre = dummy;
        ListNode currNode = head;

        for (int i = 0; i< left - 1; i++) {
            leftPre = leftPre.next;
            currNode = currNode.next;
        }

        //make a marker to node where we start reversing
        ListNode marker = currNode;

        ListNode preNode = null;

        for (int i = 0; i<= right-left; i++) {
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }

        //join pieces
        leftPre.next = preNode;
        marker.next = currNode;

        return dummy.next;
    }
}
