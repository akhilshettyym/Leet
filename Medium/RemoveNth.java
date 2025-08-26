package akhilshettyym.Leet.Medium;

// Given the head of a linked list, remove the nth node from the end of the list and return its head.
// Runtime 0ms
public class RemoveNth {

    int val;
    RemoveNth next;

    RemoveNth(int val) {
        this.val = val;
    }

    public RemoveNth removeNthFromEnd(RemoveNth head, int n) {
        int size = 0;
        RemoveNth curr = head;

        while (curr != null) {
            curr = curr.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        int indexToSearch = size - n;
        RemoveNth prev = head;
        int i = 1;

        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }

    public static void printList(RemoveNth head) {
        RemoveNth curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        RemoveNth head = new RemoveNth(1);
        head.next = new RemoveNth(2);
        head.next.next = new RemoveNth(3);
        head.next.next.next = new RemoveNth(4);
        head.next.next.next.next = new RemoveNth(5);

        System.out.println("Original list:");
        printList(head);

        int n = 2;

        RemoveNth sol = new RemoveNth(0);
        head = sol.removeNthFromEnd(head, n);

        System.out.println("After removing " + n + "th node from end:");
        printList(head);
    }
}