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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev = dummy;
        ListNode curr = head;

        int count =0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }

        curr = head;

        for(int i=0; i<count/k; i++){

            ListNode previous = prev;
            ListNode current = curr;

            for(int j=0; j<k; j++){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            current.next  = curr;
            previous.next = prev;
            prev = current;
        }
        return dummy.next;
    }
}