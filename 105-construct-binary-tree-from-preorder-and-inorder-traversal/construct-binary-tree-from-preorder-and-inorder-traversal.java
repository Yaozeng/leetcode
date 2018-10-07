// Given preorder and inorder traversal of a tree, construct the binary tree.
//
// Note:
// You may assume that duplicates do not exist in the tree.
//
// For example, given
//
//
// preorder = [3,9,20,15,7]
// inorder = [9,3,15,20,7]
//
// Return the following binary tree:
//
//
//     3
//    / \
//   9  20
//     /  \
//    15   7
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return  build(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    public TreeNode build(int [] preorder,int [] inorder,int lp,int rp,int li,int ri){
        if (lp > rp) return null;
        TreeNode root=new TreeNode(preorder[lp]);
        for(int i=li;i<=ri;i++){
            if(inorder[i]==preorder[lp]){
                root.left=build(preorder,inorder,lp+1,lp+i-li,li,i-1);
                root.right=build(preorder,inorder,lp+i-li+1,rp,i+1,ri);
            }
        }
        return root;
    }
}
