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
    public int getDecimalValue(ListNode head) {
        
        ListNode curr = head;
        int decimalValue = curr.val;
        curr = curr.next;
        while(curr != null)
        {
            decimalValue = decimalValue * 2 + curr.val;
            curr = curr.next;
        }
        return decimalValue;
    }
}