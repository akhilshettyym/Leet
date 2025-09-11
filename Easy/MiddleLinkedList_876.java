package akhilshettyym.Leet.Easy;

/* Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

LeetCode - 
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
*/

public class MiddleLinkedList_876 {
    class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        if(fast.next != null && slow.next.next != null) {
            fast = fast.next;
            slow = slow.next.next;
        }
        return slow;
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
        Object sol = outer.new Solution();
        ListNode middleNode = ((Solution) sol).middleNode(head);

        System.out.print("Middle of the List: ");
        printList(middleNode);
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