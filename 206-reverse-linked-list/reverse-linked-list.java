// Reverse a singly linked list.
//
// Example:
//
//
// Input: 1->2->3->4->5->NULL
// Output: 5->4->3->2->1->NULL
//
//
// Follow up:
//
// A linked list can be reversed either iteratively or recursively. Could you implement both?
//


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode res=new ListNode(1);
        if(head==null||head.next==null){
            return head;
        }
        while(head!=null){
            ListNode tmp=new ListNode(head.val);
            tmp.next=res.next;
            res.next=tmp;
            head=head.next;
        }
        return res.next;
    }
}
