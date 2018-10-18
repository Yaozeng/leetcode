// You are given a binary tree in which each node contains an integer value.
//
// Find the number of paths that sum to a given value.
//
// The path does not need to start or end at the root or a leaf, but it must go downwards
// (traveling only from parent nodes to child nodes).
//
// The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
//
// Example:
//
// root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
//
//       10
//      /  \
//     5   -3
//    / \    \
//   3   2   11
//  / \   \
// 3  -2   1
//
// Return 3. The paths that sum to 8 are:
//
// 1.  5 -> 3
// 2.  5 -> 2 -> 1
// 3. -3 -> 11
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
    int count=0;
    public int pathSum(TreeNode root, int sum) {
        if(root==null) return 0;
        if(root.val==sum) count++;
        PathSumOne(root.left,sum-root.val);
        PathSumOne(root.right,sum-root.val);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return count;
    }
    public void PathSumOne(TreeNode root,int sum){
        if(root==null) return;
        if(root.val==sum) count++;
        PathSumOne(root.left,sum-root.val);
        PathSumOne(root.right,sum-root.val);
    }*/
    public int pathSum(TreeNode root, int sum) {
        int[] path = new int[1000];
        return countPaths(root, sum, path, 0);
    }
    
    private int countPaths(TreeNode root, int target, int[] path, int depth) {
        if (root == null) {
            return 0;
        }
        
        path[depth] = root.val;
        int numPaths = 0;
        int curSum = 0;
        for (int i = depth; i >= 0; i--) {
            curSum += path[i];
            if (curSum == target) {
                numPaths++;    
            }
        }
        numPaths += countPaths(root.left, target, path, depth + 1);
        numPaths += countPaths(root.right, target, path, depth + 1);
        return numPaths;
    }
}
