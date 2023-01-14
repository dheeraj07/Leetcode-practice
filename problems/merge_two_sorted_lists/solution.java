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
    public ListNode mergeTwoLists(ListNode ptr1, ListNode ptr2) {
        
        ListNode res = new ListNode(-1);
        ListNode dummy = res;
        
        if(ptr1 == null)
        {
            return ptr2;
        }
        else if(ptr2 == null)
        {
            return ptr1;
        }
        
        while(ptr1 != null && ptr2 != null)
        {
            if(ptr1.val <= ptr2.val)
            {
                dummy.next = ptr1;
                ptr1 = ptr1.next;
            }
            else
            {
                dummy.next = ptr2;
                ptr2 = ptr2.next; 
            }
            dummy = dummy.next;
        }
        
        if(ptr1 != null)
        {
            dummy.next = ptr1;
        }
        else
        {
            dummy.next = ptr2;
        }
        return res.next;
    }
}