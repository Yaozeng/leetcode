// Given a linked list, remove the n-th node from the end of list and return its head.
//
// Example:
//
//
// Given linked list: 1->2->3->4->5, and n = 2.
//
// After removing the second node from the end, the linked list becomes 1->2->3->5.
//
//
// Note:
//
// Given n will always be valid.
//
// Follow up:
//
// Could you do this in one pass?
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dumy=new ListNode(0);
        dumy.next=head;
        int count=0;
        ListNode tmp=head;
        while(tmp!=null){
            count++;
            tmp=tmp.next;
        }
        tmp=dumy;
        for(int i=0;i<count-n;i++){
            tmp=tmp.next;
        }
        tmp.next=tmp.next.next;
        return dumy.next;
    }
}
