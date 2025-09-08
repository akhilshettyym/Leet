package akhilshettyym.Leet.Easy;

/* Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well. */
public class RemoveDuplicate_83 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null)
                return null;

            ListNode curr = head;
            while (curr != null && curr.next != null) {
                if (curr.val == curr.next.val) {
                    curr.next = curr.next.next;
                } else {
                    curr = curr.next;
                }
            }
            return head;
        }

        public void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(1);
            head.next.next = new ListNode(2);
            head.next.next.next = new ListNode(3);
            head.next.next.next.next = new ListNode(3);

            Solution sol = new Solution();
            ListNode result = sol.deleteDuplicates(head);

            while (result != null) {
                System.out.print(result.val + " ");
                result = result.next;
            }
        }
    }
}