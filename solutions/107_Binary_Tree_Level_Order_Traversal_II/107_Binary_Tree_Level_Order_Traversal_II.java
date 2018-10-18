// Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
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
// return its bottom-up level order traversal as:
//
// [
//   [15,7],
//   [9,20],
//   [3]
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue <TreeNode> que=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            List <Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode tmp=que.poll();
                list.add(tmp.val);
                if(tmp.left!=null) que.add(tmp.left);
                if(tmp.right!=null) que.add(tmp.right);
            }
            res.add(list);
        }
        List <List<Integer>> res1=new ArrayList<>();
        for(int i=res.size()-1;i>=0;i--){
            res1.add(res.get(i));
        }
        return res1;
    }
}
