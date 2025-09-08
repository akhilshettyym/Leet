package akhilshettyym.Leet.Easy;
/* Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
Runtime 1ms */
public class RemovePosLL_203 {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null || head.val == val) {
            head = head.next;
        }

        if(head == null) {
            return null;
        }

        ListNode currNode = head;
        while(currNode != null) {
            if(currNode.next.val == val){
                currNode.next = currNode.next.next;
            } else {
            currNode = currNode.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        
    }
}