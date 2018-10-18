// Given a binary tree, return all root-to-leaf paths.
//
// Note: A leaf is a node with no children.
//
// Example:
//
//
// Input:
//
//    1
//  /   \
// 2     3
//  \
//   5
//
// Output: ["1->2->5", "1->3"]
//
// Explanation: All root-to-leaf paths are: 1->2->5, 1->3
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
    List <String> res=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return res;
        StringBuffer stb=new StringBuffer();
        stb.append(root.val);
        if(root.left==null&&root.right==null){
            res.add(stb.toString());
            return res;
        }
        StringBuffer stb2=new StringBuffer(stb);
        helper(root.left,stb);
        helper(root.right,stb2);
        return res;
    }
    public void helper(TreeNode root,StringBuffer stb){
        if(root==null) return;
        stb.append("->"+root.val);
         StringBuffer stb2=new StringBuffer(stb);
        if(root.left==null&&root.right==null) res.add(stb.toString());
        helper(root.left,stb);
        helper(root.right,stb2);
    }
    */
        public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> res = new ArrayList<>();
        if(root==null) return res;
     
        
        helper(root, "", res);
        return res;
    }
    
    public void helper(TreeNode root, String s, List<String> res){
        if(root.left==null && root.right==null) res.add(s+root.val);
        if(root.left!=null) helper(root.left, s+root.val+"->", res);
        if(root.right!=null) helper(root.right, s+root.val+"->", res);
    }
    
}
