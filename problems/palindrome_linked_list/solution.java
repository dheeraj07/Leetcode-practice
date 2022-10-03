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
    
    public ListNode splitAndReverseList(ListNode splitList)
    {
        ListNode curr = splitList, prev = null, temp;
        while(curr != null)
        {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;  
    }
    
    
    public boolean isPalindrome(ListNode head) {
        
        ListNode fast = head, slow = head;
        
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode splitList = splitAndReverseList(slow);
        
        ListNode compare = head;
        while(splitList != null)
        {
            if(splitList.val != compare.val)
            {
                return false;
            }
            splitList = splitList.next;
            compare = compare.next;
        }
        return true;

    }
}