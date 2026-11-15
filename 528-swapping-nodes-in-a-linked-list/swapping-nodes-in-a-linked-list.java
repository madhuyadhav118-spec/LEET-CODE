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
    public ListNode swapNodes(ListNode head, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        int n = list.size();
        int temp = list.get(k-1);
        list.set(k-1,list.get(n-k));
        list.set(n-k,temp);

        int idx = 0;
        curr = head;
        while(curr != null) {
            curr.val = list.get(idx++);
            curr = curr.next;
        }
        return head;
    }
}