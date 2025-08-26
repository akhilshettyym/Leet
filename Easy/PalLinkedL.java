package akhilshettyym.Leet.Easy;

// Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
// Runtime 6ms
public class PalLinkedL {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode findMiddle(ListNode head) {
            ListNode hare = head;
            ListNode turtle = head;

            while (hare.next != null && hare.next.next != null) {
                hare = hare.next.next;
                turtle = turtle.next;
            }
            return turtle;
        }

        public ListNode reverse(ListNode head) {
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

        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) {
                return true;
            }
            ListNode middle = findMiddle(head);
            ListNode secondHalfStart = reverse(middle.next);

            ListNode firstHalfStart = head;
            while (secondHalfStart != null) {
                if (firstHalfStart.val != secondHalfStart.val) {
                    return false;
                }
                firstHalfStart = firstHalfStart.next;
                secondHalfStart = secondHalfStart.next;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        Solution sol = new Solution();
        boolean result = sol.isPalindrome(head);

        System.out.println("Is Palindrome? " + result);
    }
}