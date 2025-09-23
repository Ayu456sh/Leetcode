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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left,right);
    }
    private ListNode merge(ListNode list1, ListNode list2){
        ListNode ans = new ListNode();
        ListNode curr = ans;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                curr.next=list1;
                list1=list1.next;
            }
            else{
                curr.next=list2;
                list2=list2.next;
            }
            curr=curr.next;
        }
        while(list1!=null){
            curr.next=list1;
            list1=list1.next;
            curr=curr.next;
        }
        while(list2!=null){
            curr.next=list2;
            list2=list2.next;
            curr=curr.next;
        }
        return ans.next;
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
}