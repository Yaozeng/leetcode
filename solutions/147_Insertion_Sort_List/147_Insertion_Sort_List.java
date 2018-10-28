// Sort a linked list using insertion sort.
//
//
//
//
//
// A graphical example of insertion sort. The partial sorted list (black) initially contains only the first element in the list.
// With each iteration one element (red) is removed from the input data and inserted in-place into the sorted list
//  
//
//
//
//
// Algorithm of Insertion Sort:
//
//
// 	Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
// 	At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there.
// 	It repeats until no input elements remain.
//
//
//
// Example 1:
//
//
// Input: 4->2->1->3
// Output: 1->2->3->4
//
//
// Example 2:
//
//
// Input: -1->5->3->4->0
// Output: -1->0->3->4->5
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
    public ListNode insertionSortList(ListNode head) {
        
        if(head==null || head.next==null) return head;
        //point to last value of sorted list
        ListNode sort=head;
        //pooint to first value of unsorted list
        ListNode unSort=head.next;
        
        while(unSort!=null){
            //pay attention for equation! (if two element are equal, there is no need to switch them)
            if(sort.val <= unSort.val){
                unSort=unSort.next;
                sort=sort.next;;
            }else{
                //check whether the first unSort node < head of node?
                //if yes we need put this node at the first position and update the head node
                
                // record the unsort node which will be inserted into sort list in the next round
                ListNode temp=unSort.next; 
                
                if(unSort.val < head.val){                    
                    //switch the unSort node and head node
                    unSort.next=head;
                    sort.next=temp;
                    //now unSort will be our new head
                    head=unSort;
                    //update the unSort point
                    unSort=temp;
                    
                }else{
                    // if go to this condition, we know that the unSort Node should be in the somewhere
                    // bewteen head node and sort node, so we need to try to find this position, record prev and succ node of                         // this postion and insert the unSort into this position
                    
                    ListNode prev=head;
                    ListNode succ=head.next;
                    while(unSort.val>succ.val){
                        prev=prev.next;
                        succ=succ.next;
                    }
                    // after this while loopm, we have already found the right position 
                    // in which the unSort node should be inserted
                                   
                    sort.next=temp;
                    unSort.next=succ;
                    prev.next=unSort;
                    
                    //update unSort to next position 
                    unSort=temp;
                    
                }
            }
        }
        
        //the node list should be sorted and just return the head node
        return head;
        
    }
}
