package akhilshettyym.Leet.Medium;

// Given the head of a linked list, remove the nth node from the end of the list and return its head.
// Runtime 0ms
public class RemoveNth_19 {

    int val;
    RemoveNth_19 next;

    RemoveNth_19(int val) {
        this.val = val;
    }

    public RemoveNth_19 removeNthFromEnd(RemoveNth_19 head, int n) {
        int size = 0;
        RemoveNth_19 curr = head;

        while (curr != null) {
            curr = curr.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        int indexToSearch = size - n;
        RemoveNth_19 prev = head;
        int i = 1;

        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }

    public static void printList(RemoveNth_19 head) {
        RemoveNth_19 curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        RemoveNth_19 head = new RemoveNth_19(1);
        head.next = new RemoveNth_19(2);
        head.next.next = new RemoveNth_19(3);
        head.next.next.next = new RemoveNth_19(4);
        head.next.next.next.next = new RemoveNth_19(5);

        System.out.println("Original list:");
        printList(head);

        int n = 2;

        RemoveNth_19 sol = new RemoveNth_19(0);
        head = sol.removeNthFromEnd(head, n);

        System.out.println("After removing " + n + "th node from end:");
        printList(head);
    }
}