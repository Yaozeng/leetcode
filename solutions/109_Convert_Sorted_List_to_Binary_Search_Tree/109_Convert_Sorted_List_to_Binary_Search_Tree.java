// Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
//
// For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
//
// Example:
//
//
// Given the sorted linked list: [-10,-3,0,5,9],
//
// One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
//
//       0
//      / \
//    -3   9
//    /   /
//  -10  5
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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    /*
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int []nums=new int[list.size()];
        int j=0;
        for(Integer i:list){
            nums[j++]=i;
        }
        return reBuild(nums,0,nums.length-1);
    }
    public TreeNode reBuild(int [] nums,int start,int end){
        if(start<0||start>end){
            return null;
        }
        int mid=(int)Math.ceil((start+end)/2);
        TreeNode head=new TreeNode(nums[mid]);
        head.left=reBuild(nums,start,mid-1);
        head.right=reBuild(nums,mid+1,end);
        return head;
    }
    */
        public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        return toBST(head,null);
    }
    public TreeNode toBST(ListNode head, ListNode tail){//找链表终点快慢指针
        ListNode slow = head;
        ListNode fast = head;
        if(head==tail) return null;

        while(fast!=tail&&fast.next!=tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode thead = new TreeNode(slow.val);
        thead.left = toBST(head,slow);
        thead.right = toBST(slow.next,tail);
        return thead;
    }
}
