// Reverse a linked list from position m to n. Do it in one-pass.
//
// Note: 1 ≤ m ≤ n ≤ length of list.
//
// Example:
//
//
// Input: 1->2->3->4->5->NULL, m = 2, n = 4
// Output: 1->4->3->2->5->NULL
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null||head.next==null) return head;
        ListNode reverseList=new ListNode(0);
        ListNode firstList =new ListNode(0);
        ListNode lastList=new ListNode(0);
        ListNode tail=firstList;
        ListNode tail2=reverseList;
        int count=1;
        while(head!=null){
            ListNode tmp=new ListNode(head.val);
            if(count>=m&&count<=n){
                if(count==m) tail2=tmp;
                tmp.next=reverseList.next;
                reverseList.next=tmp;  
            }else{
                if(count>n){
                    lastList.next=head;
                    break;
                }else{
                    tmp.next=tail.next;
                    tail.next=tmp;
                    tail=tail.next;
                }
            }  
            head=head.next;
            count++;
        }
            
            tail.next=reverseList.next;
            tail2.next=lastList.next;
        return firstList.next;
    }
}
