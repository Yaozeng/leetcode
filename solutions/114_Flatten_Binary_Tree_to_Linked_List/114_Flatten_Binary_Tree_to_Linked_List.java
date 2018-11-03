// Given a binary tree, flatten it to a linked list in-place.
//
// For example, given the following tree:
//
//
//     1
//    / \
//   2   5
//  / \   \
// 3   4   6
//
//
// The flattened tree should look like:
//
//
// 1
//  \
//   2
//    \
//     3
//      \
//       4
//        \
//         5
//          \
//           6
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
    /*
    public void flatten(TreeNode root) {
        TreeNode tmp=new TreeNode(0);
        if(root==null) return ;
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            for(int i=0;i<size;i++){
            TreeNode tmpNode=que.poll();
            insert(tmp,tmpNode);
            if(tmpNode.left!=null) que.add(tmpNode.left);
            if(tmpNode.right!=null) que.add(tmpNode.right);
            }
        }
        root=tmp.right;
        return;
    }
    public void insert(TreeNode root,TreeNode insert){
        TreeNode parent=root;
        while(parent.right!=null){
                    if(insert.val<parent.right.val){
                        insert.right=parent.right;
                        parent.right=insert;
                        return;
            
        }else{
                parent=parent.right;
                    }
        }
        parent.right=insert;
        return;
    }
    */
    private TreeNode prev = null;

public void flatten(TreeNode root) {
    if (root == null)
        return;
    flatten(root.right);
    flatten(root.left);
    root.right = prev;
    root.left = null;
    prev = root;
}
}
