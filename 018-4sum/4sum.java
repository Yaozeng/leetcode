// Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
//
// Note:
//
// The solution set must not contain duplicate quadruplets.
//
// Example:
//
//
// Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
//
// A solution set is:
// [
//   [-1,  0, 0, 1],
//   [-2, -1, 1, 2],
//   [-2,  0, 0, 2]
// ]
//
//


class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
           List<List<Integer>> result = new ArrayList<>();
    if(nums == null || nums.length < 4) return result;
    Arrays.sort(nums);
    int len = nums.length;
    
    for(int i = 0; i < len - 3; i++) {
        for(int j = len - 1; j > i + 2; j--) {
            if ((i > 0 && nums[i] == nums[i-1]) || (j < len - 1 && nums[j] == nums[j + 1])) continue;
            int lo = i + 1, hi = j - 1;
            while(lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi] + nums[j];
                if(sum == target) {
                    result.add(Arrays.asList(nums[i], nums[lo], nums[hi], nums[j]));
                    while(lo < hi && nums[lo] == nums[lo + 1]) lo++;
                    while(lo < hi && nums[hi] == nums[hi - 1]) hi--;
                    lo++; hi--;
                } else if(sum < target) lo++;
                else hi--;
            } 
        }
    }
    return result;
        
    }
}
