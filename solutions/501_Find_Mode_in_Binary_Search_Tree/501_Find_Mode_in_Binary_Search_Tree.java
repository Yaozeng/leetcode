// Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.
//
// Assume a BST is defined as follows:
//
//
// 	The left subtree of a node contains only nodes with keys less than or equal to the node's key.
// 	The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
// 	Both the left and right subtrees must also be binary search trees.
//
//
//  
//
// For example:
// Given BST [1,null,2,2],
//
//
//    1
//     \
//      2
//     /
//    2
//
//
//  
//
// return [2].
//
// Note: If a tree has more than one mode, you can return them in any order.
//
// Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).
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
    List <Integer> list=new ArrayList<>();
    public int[] findMode(TreeNode root) {
         preOrder(root);
        if(list.size()==0) return new int[]{};
        Map <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<list.size();i++){
            if(map.containsKey(list.get(i))){
                map.put(list.get(i),map.get(list.get(i))+1);
            }else{
                map.put(list.get(i),1);
            }
        }
        int max=0;
        for(Integer value:map.values()){
            if(value>max) max=value;
        }
        List <Integer> res=new ArrayList<>();
        for(Integer key:map.keySet()){
            if(map.get(key.intValue())==max){
                res.add(key.intValue());
            }
        }
        int [] re=new int[res.size()];
        for(int i=0;i<res.size();i++){
            re[i]=res.get(i);
        }
        return re;
    }
    public void preOrder(TreeNode root){
        if(root==null) return ;
        preOrder(root.left);
        list.add(root.val);
        preOrder(root.right);
    }
}
