// Given a singly linked list, determine if it is a palindrome.
//
// Example 1:
//
//
// Input: 1->2
// Output: false
//
// Example 2:
//
//
// Input: 1->2->2->1
// Output: true
//
// Follow up:
// Could you do it in O(n) time and O(1) space?
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
    public boolean isPalindrome(ListNode head) {
        List <Integer> num=new ArrayList<>();
        while(head!=null){
            num.add(head.val);
            head=head.next;
        }
        if(num.size()<2){
            return true;
        }
        int i=0;
        int j=num.size()-1;
        while(i<j){
            if(num.get(i)-num.get(j)==0){
                i++;
                j--;
            }else{
               return false; 
            }
        }
        return true;
    }
}
