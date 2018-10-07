// Given a collection of distinct integers, return all possible permutations.
//
// Example:
//
//
// Input: [1,2,3]
// Output:
// [
//   [1,2,3],
//   [1,3,2],
//   [2,1,3],
//   [2,3,1],
//   [3,1,2],
//   [3,2,1]
// ]
//
//


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // O(n! * n) running time
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) return list;
        backtrack(list, new ArrayList<Integer>(), nums);
        return list;
    }
    // O(n! * n) running time
    public static void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            backtrack(list, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
}
