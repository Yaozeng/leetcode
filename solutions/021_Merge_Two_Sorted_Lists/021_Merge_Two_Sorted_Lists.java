// Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
//
// Example:
//
// Input: 1->2->4, 1->3->4
// Output: 1->1->2->3->4->4
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(1);
        ListNode p=new ListNode(1);
        res.next=p;
        while(l1!=null&&l2!=null){
            ListNode tmp=new ListNode(1);
            if(l1.val>l2.val){
                tmp.val=l2.val;
                p.next=tmp;
                p=p.next;          
                l2=l2.next;
            }else{
                tmp.val=l1.val;
                p.next=tmp;
                p=p.next;
                l1=l1.next;
            }
        }
        while(l1!=null){
            ListNode tmp2=new ListNode(1);
            tmp2.val=l1.val;
                p.next=tmp2;
                p=p.next;
                l1=l1.next;
        }
        while(l2!=null){
            ListNode tmp3=new ListNode(1);
            tmp3.val=l2.val;
                p.next=tmp3;
                p=p.next;          
                l2=l2.next;
        }
        return res.next.next;
    }
}
