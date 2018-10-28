// Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
//
// Example:
//
//
// Input: [1,2,3,null,5,null,4]
// Output: [1, 3, 4]
// Explanation:
//
//    1            <---
//  /   \
// 2     3         <---
//  \     \
//   5     4       <---
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        Queue <TreeNode> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            for(int i=0;i<size;i++){
                TreeNode node=que.poll();
                if(i==size-1) res.add(node.val);
                if(node.left!=null) que.add(node.left);
                if(node.right!=null) que.add(node.right);
            }
        }
        return res;
    }
    */
        public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        dfs(root, result, 0);
        return result;     
    }
    
    private void dfs(TreeNode root, List<Integer> result, int level ){
        // base case
        if(root == null) return;
        
        if(level == result.size()){
            result.add(root.val);
        }
        
        dfs(root.right, result, level+1);
        dfs(root.left,result, level+1);
    }
}
