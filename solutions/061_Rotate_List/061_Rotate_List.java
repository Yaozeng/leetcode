// Given a linked list, rotate the list to the right by k places, where k is non-negative.
//
// Example 1:
//
//
// Input: 1->2->3->4->5->NULL, k = 2
// Output: 4->5->1->2->3->NULL
// Explanation:
// rotate 1 steps to the right: 5->1->2->3->4->NULL
// rotate 2 steps to the right: 4->5->1->2->3->NULL
//
//
// Example 2:
//
//
// Input: 0->1->2->NULL, k = 4
// Output: 2->0->1->NULL
// Explanation:
// rotate 1 steps to the right: 2->0->1->NULL
// rotate 2 steps to the right: 1->2->0->NULL
// rotate 3 steps to the right: 0->1->2->NULL
// rotate 4 steps to the right: 2->0->1->NULL
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        int count=0;
        ListNode tmp=head;
        while(tmp!=null){
            count++;
            tmp=tmp.next;
        }
        if(k%count==0) return head;
        ListNode dummy=new ListNode(0);
        tmp=head;
        for(int i=1;i<count-k%count;i++){
            tmp=tmp.next;
        }
        dummy.next=tmp.next;
        ListNode tmp2=dummy.next;
        while(tmp2.next!=null){
            tmp2=tmp2.next;
        }
        tmp2.next=head;
        tmp.next=null;
        return dummy.next;        
    }
}
