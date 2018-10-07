// Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
//
// You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
//
// Example 1:
//
//
// Input: 1->2->3->4->5->NULL
// Output: 1->3->5->2->4->NULL
//
//
// Example 2:
//
//
// Input: 2->1->3->5->6->4->7->NULL
// Output: 2->3->6->7->1->5->4->NULL
//
//
// Note:
//
//
// 	The relative order inside both the even and odd groups should remain as it was in the input.
// 	The first node is considered odd, the second node even and so on ...
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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode dummyEven = head.next;
        ListNode currOdd = head;
        ListNode currEven = head.next;
				//if there has nextOdd, than nextEven will either be a valid node or null
        while(hasNext(currOdd)){
            ListNode nextOdd = currOdd.next.next;
            ListNode nextEven = currEven.next.next;
            currOdd.next = nextOdd;
            currEven.next = nextEven;
            currOdd = nextOdd;
            currEven = nextEven;
        }
				//connect evens to odds
        currOdd.next = dummyEven;
        return head;
    }
    public boolean hasNext(ListNode currNode){
        return currNode.next!=null && currNode.next.next!=null;
    }
}
