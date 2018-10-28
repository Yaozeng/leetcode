// Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
//
// Example 1:
//
//
// Input: 1->2->3->3->4->4->5
// Output: 1->2->5
//
//
// Example 2:
//
//
// Input: 1->1->1->2->3
// Output: 2->3
//
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode tmp=new ListNode(0);
        ListNode tmp2=tmp;
        ListNode cur=head;
        while(cur!=null){
            if(cur.next!=null&&cur.val!=cur.next.val){
                ListNode tmp3=new ListNode(cur.val);
                tmp2.next=tmp3;
                cur=cur.next;
                tmp2=tmp2.next;
            }
            else{
            if(cur.next==null){
               tmp2.next=cur;
               return tmp.next;
            }
            while(cur!=null&&cur.next!=null&&cur.val==cur.next.val) cur=cur.next;
            cur=cur.next;
            }
        }
        return tmp.next;
    }
}
