/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        
        if(head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode curr = head;
        int length = 1;
        while(curr.next != null) {
            curr = curr.next;
            length++;
        }

        k = k % length;
        if(k == 0) {
            return head;
        }
        
        curr.next = head; // Circular

        ListNode newCurr = head;
        int steps = length - k;
       

        for(int i = 1; i < steps; i++) {
            newCurr = newCurr.next;

        }

        ListNode newHead = newCurr.next;
        newCurr.next = null;
        
        return newHead;
    }
}