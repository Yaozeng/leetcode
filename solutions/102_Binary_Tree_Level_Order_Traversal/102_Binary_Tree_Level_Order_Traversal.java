// Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
//
// For example:
// Given binary tree [3,9,20,null,null,15,7],
//
//     3
//    / \
//   9  20
//     /  \
//    15   7
//
//
//
// return its level order traversal as:
//
// [
//   [3],
//   [9,20],
//   [15,7]
// ]
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
    Queue <TreeNode> que=new LinkedList<TreeNode>();
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<List<Integer>>();
        }
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode tmp=que.poll(); 
                list.add(tmp.val);
            if(tmp.left!=null){
                que.add(tmp.left);
            }
            if(tmp.right!=null){
                que.add(tmp.right);
            }
            }    
            res.add(list);
        }
            return res;
    }

}
