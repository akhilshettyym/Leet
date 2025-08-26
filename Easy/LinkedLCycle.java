package akhilshettyym.Leet.Easy;

/* Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.
Runtime 0ms */
public class LinkedLCycle {
    int val;
    LinkedLCycle next;

    LinkedLCycle(int x) {
        val = x;
        next = null;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        LinkedLCycle node1 = new LinkedLCycle(3);
        LinkedLCycle node2 = new LinkedLCycle(2);
        LinkedLCycle node3 = new LinkedLCycle(0);
        LinkedLCycle node4 = new LinkedLCycle(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        System.out.println("Has Cycle? " + sol.hasCycle(node1));
        LinkedLCycle a = new LinkedLCycle(1);
        LinkedLCycle b = new LinkedLCycle(2);
        a.next = b;
        System.out.println("Has Cycle? " + sol.hasCycle(a));
    }

    public boolean hasCycle(LinkedLCycle head) {
        if (head == null) {
            return false;
        }
        LinkedLCycle fast = head;
        LinkedLCycle slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}