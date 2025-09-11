package akhilshettyym.Leet.Easy;

/* Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.
Runtime 0ms 

LeetCode - 
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}
*/

public class LinkedLCycle_141 {
    int val;
    LinkedLCycle_141 next;

    LinkedLCycle_141(int x) {
        val = x;
        next = null;
    }

    public boolean hasCycle(LinkedLCycle_141 head) {
        if (head == null) {
            return false;
        }
        LinkedLCycle_141 fast = head;
        LinkedLCycle_141 slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedLCycle_141 util = new LinkedLCycle_141(0);

        LinkedLCycle_141 node1 = new LinkedLCycle_141(3);
        LinkedLCycle_141 node2 = new LinkedLCycle_141(2);
        LinkedLCycle_141 node3 = new LinkedLCycle_141(0);
        LinkedLCycle_141 node4 = new LinkedLCycle_141(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println("Has Cycle? " + util.hasCycle(node1));

        LinkedLCycle_141 a = new LinkedLCycle_141(1);
        LinkedLCycle_141 b = new LinkedLCycle_141(2);
        a.next = b;
        System.out.println("Has Cycle? " + util.hasCycle(a));
    }
}