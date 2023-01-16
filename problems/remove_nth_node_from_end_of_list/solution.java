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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode firstP = dummy, secondP = dummy;
        int track = 0, traversal = 0;
        
        if(n == 0)
        {
            return head;
        }
        
        while(firstP.next != null)
        {
            firstP = firstP.next;
            traversal++;
            if(traversal - track > n)
            {
                secondP = secondP.next;
                track++;
            }
        }
        
        
        secondP.next = secondP.next.next;
        
        return dummy.next;
    }
}