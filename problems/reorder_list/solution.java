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
    

    
    public void reorderList(ListNode head) 
    {
        ListNode slow = head, fast = head;
        
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode prev = null, curr = slow, temp;
        
        while(curr != null)
        {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        ListNode front = head, rear = prev;
        
        while(rear.next != null)
        {
            temp = front.next;
            front.next = rear;
            front = temp;
            temp = rear.next;
            rear.next = front;
            rear = temp;
        }
    }
}