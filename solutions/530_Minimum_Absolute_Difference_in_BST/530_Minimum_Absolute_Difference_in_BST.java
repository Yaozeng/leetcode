// Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.
//
// Example:
//
//
// Input:
//
//    1
//     \
//      3
//     /
//    2
//
// Output:
// 1
//
// Explanation:
// The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
//
//
//  
//
// Note: There are at least two nodes in this BST.
//


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
    List <Integer> list=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        preOrder(root);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i+1)-list.get(i)<min){
                min=list.get(i+1)-list.get(i);
            }
        }
        return min;
    }
    public void preOrder(TreeNode root){
        if(root==null) return ;
        preOrder(root.left);
        list.add(root.val);
        preOrder(root.right);
    }
}
