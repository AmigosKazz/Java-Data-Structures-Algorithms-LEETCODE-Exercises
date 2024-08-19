package org.example.LinkedList.leetcode;
// 2095. Delete the Middle Node of a Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode curr = head;

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        while (fast != null && fast.next != null) {
            slow = curr;
            curr = curr.next;
            fast = fast.next.next;
        }

        slow.next = curr.next;
        curr.next = null;

        return head;
    }
}
