// Given a binary tree, find its minimum depth.
//
// The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
//
// Note: A leaf is a node with no children.
//
// Example:
//
// Given binary tree [3,9,20,null,null,15,7],
//
//
//     3
//    / \
//   9  20
//     /  \
//    15   7
//
// return its minimum depth = 2.
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
    public int minDepth(TreeNode root) {
        int count=0;
        if(root==null) return 0;
        Queue <TreeNode> que=new LinkedList<>();
        que.add(root);
        count++;
        while(!que.isEmpty()){
            int size=que.size();
            for(int i=0;i<size;i++){
                TreeNode tmp=que.poll();
                if(tmp.left==null&tmp.right==null) return count;
                if(tmp.left!=null) que.add(tmp.left);
                if(tmp.right!=null) que.add(tmp.right);
            }
            count++;
        }
        return count;
    }
}
