/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null || head.next == null || head.next.next == null) return false;
        
        ListNode nextNode = head.next;
        ListNode fastNextNode = head.next.next;
        
        
        while(fastNextNode != null && fastNextNode.next != null)
        {
            if(nextNode.equals(fastNextNode))
            {
                return true;
            }
            nextNode = nextNode.next;
            fastNextNode = fastNextNode.next.next;
        }
        return false;   
    }
}