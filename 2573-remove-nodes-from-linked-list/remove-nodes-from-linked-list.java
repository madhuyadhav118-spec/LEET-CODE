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
    public ListNode removeNodes(ListNode head) {

        List<Integer> list = new ArrayList<>();

        ListNode temp = head;
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        Stack<Integer> st = new Stack<>();
        int n = list.size();
        // st.push(l.get(n-1));
        int max = Integer.MIN_VALUE;
        for(int i = n - 1; i >= 0;i--) {
            if(list.get(i) >= max) {
                st.push(list.get(i));
                max = list.get(i);
            }
            
        }

       ListNode dummy = new ListNode(0);
       ListNode curr = dummy;
        
        while(!st.isEmpty()) {
            curr.next = new ListNode(st.pop());
            curr = curr.next;
        }
        
        return dummy.next;
    }
}