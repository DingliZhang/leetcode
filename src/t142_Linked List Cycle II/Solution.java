package t142_Linked List Cycle II;

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

	public ListNode detectCycle(ListNode head) {
	    if(head==null)
	    {return null;}
    	while(true)
    	{
    		if(head.val==head.hashCode())
    		{
    			return head;
    		}
    		if(head.next!=null){
    			head.val=head.hashCode();
    			head=head.next;
    		}else{
    			return null;
    		}
    	}
    }
}