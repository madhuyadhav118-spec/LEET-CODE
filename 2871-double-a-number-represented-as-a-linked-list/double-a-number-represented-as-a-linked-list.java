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
    public ListNode doubleIt(ListNode head) {
       // ListNode dummy = new ListNode(0);
        ListNode curr = head;
        ListNode head1= null;
        int carry = 0;
        Stack<Integer> st = new Stack<>();
        while(curr != null) {
            st.push(curr.val);
            curr = curr.next;
        }

        while(!st.isEmpty() || carry != 0) {
            int sum = carry;
            if(!st.isEmpty()) {
                sum += 2 * st.pop();
            }
            ListNode node = new ListNode(sum % 10);
            node.next = head1;
            head1 = node;
            carry = sum / 10;
        }

        return head1;
        
    }
}