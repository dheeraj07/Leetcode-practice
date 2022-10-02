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
    public ListNode reverseList(ListNode head) {
        
        ListNode curr = null, newHead = head, temp = null;
        if(head == null)
        {
            return head;
        }
        
        while(true)
        {   
            temp = newHead.next;
            newHead.next = curr;
            curr = newHead;
            if(temp == null)
            {
               break;
            }
            newHead = temp;
        }
        
        return newHead;
    }
}