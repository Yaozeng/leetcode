// Given a binary tree, return the preorder traversal of its nodes' values.
//
// Example:
//
//
// Input: [1,null,2,3]
//    1
//     \
//      2
//     /
//    3
//
// Output: [1,2,3]
//
//
// Follow up: Recursive solution is trivial, could you do it iteratively?
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
    List<Integer> res=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList<Integer>();
        }
        res.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return res;
    }
}
