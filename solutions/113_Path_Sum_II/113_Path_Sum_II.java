// Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
//
// Note: A leaf is a node with no children.
//
// Example:
//
// Given the below binary tree and sum = 22,
//
//
//       5
//      / \
//     4   8
//    /   / \
//   11  13  4
//  /  \    / \
// 7    2  5   1
//
//
// Return:
//
//
// [
//    [5,4,11,2],
//    [5,8,4,5]
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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res=new ArrayList<>();
        backtrace(res,new ArrayList<Integer>(),root,sum);
        return res;
    }
    public void backtrace(List<List<Integer>> list,List<Integer> tmpList,TreeNode root,int sum){
        if(root==null) return ;
        if(sum==root.val&&root.left==null&&root.right==null){
            tmpList.add(root.val);
            list.add(tmpList);
            return;
        }
        tmpList.add(root.val);
        List <Integer> newList=new ArrayList<>(tmpList);
        backtrace(list,tmpList,root.left,sum-root.val);
        backtrace(list,newList,root.right,sum-root.val);
        return ;
    }
}
