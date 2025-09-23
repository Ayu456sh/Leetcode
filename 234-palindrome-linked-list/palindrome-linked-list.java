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
    public boolean isPalindrome(ListNode head) {
        ListNode middle = getMid(head);
        ListNode headSec = reverse(middle);
        ListNode reversed = headSec;

        while(head!=null && headSec!=null){
            if(head.val!=headSec.val){
                break;
            }
            head=head.next;
            headSec=headSec.next;
        }
        reverse(reversed);
        if(head==null || headSec==null){
            return true;
        }
        return false;
    }
    private ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;

        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev!=null){
            prev.next=null;
        }
        return slow;
    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}