package akhilshettyym.Leet.Easy;

/* Given the head of a singly linked list, reverse the list, and return the reversed list.
Runtime 0ms

LeetCode - 
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }
}
*/

import akhilshettyym.Leet.Easy.PalLinkedL234.ListNode;

public class ReverseLL_206 {

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;

                prev = curr;
                curr = next;
            }
            return prev;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        ReverseLL_206 outer = new ReverseLL_206();
        Solution sol = outer.new Solution();
        ListNode reversedHead = sol.reverseList(head);

        System.out.print("Reversed List: ");
        printList(reversedHead);
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}