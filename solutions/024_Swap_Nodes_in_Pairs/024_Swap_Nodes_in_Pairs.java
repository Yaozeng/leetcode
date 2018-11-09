// Given a linked list, swap every two adjacent nodes and return its head.
//
// Example:
//
//
// Given 1->2->3->4, you should return the list as 2->1->4->3.
//
// Note:
//
//
// 	Your algorithm should use only constant extra space.
// 	You may not modify the values in the list's nodes, only nodes itself may be changed.
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
public ListNode swapPairs(ListNode head) {
if(head == null){
return null;
}
if(head.next==null){
return head;
}
ListNode cur = head.next;
ListNode nextnode = cur.next;
cur.next = head;
head.next = swapPairs(nextnode);
return cur;
}
}
