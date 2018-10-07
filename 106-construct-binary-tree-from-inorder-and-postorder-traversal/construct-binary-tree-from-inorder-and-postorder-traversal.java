// Given inorder and postorder traversal of a tree, construct the binary tree.
//
// Note:
// You may assume that duplicates do not exist in the tree.
//
// For example, given
//
//
// inorder = [9,3,15,20,7]
// postorder = [9,15,7,20,3]
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    }
        public TreeNode build(int [] inorder,int [] postorder,int li,int ri,int lp,int rp){
        if (lp > rp) return null;
        TreeNode root=new TreeNode(postorder[rp]);
        for(int i=li;i<=ri;i++){
            if(inorder[i]==postorder[rp]){
                root.left=build(inorder,postorder,li,i-1,lp,lp+i-li-1);
                root.right=build(inorder,postorder,i+1,ri,lp+i-li,rp-1);
            }
        }
        return root;
    }
}
