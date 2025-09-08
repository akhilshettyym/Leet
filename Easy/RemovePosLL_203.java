package akhilshettyym.Leet.Easy;

/* Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head. */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class RemovePosLL_203 {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        ListNode currNode = head;
        while (currNode != null && currNode.next != null) {
            if (currNode.next.val == val) {
                currNode.next = currNode.next.next;
            } else {
                currNode = currNode.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        RemovePosLL_203 sol = new RemovePosLL_203();
        int val = 6;
        ListNode newHead = sol.removeElements(head, val);

        System.out.print("After removing " + val + ": ");
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}