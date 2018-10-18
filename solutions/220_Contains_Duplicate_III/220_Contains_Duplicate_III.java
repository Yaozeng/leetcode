// Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.
//
//
// Example 1:
//
//
// Input: nums = [1,2,3,1], k = 3, t = 0
// Output: true
//
//
//
// Example 2:
//
//
// Input: nums = [1,0,1,1], k = 1, t = 2
// Output: true
//
//
//
// Example 3:
//
//
// Input: nums = [1,5,9,1,5,9], k = 2, t = 3
// Output: false
//
//
//
//
//


class Solution {
    /*
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length&&j-i<=k;j++){
                if(Math.abs((long)nums[i]-nums[j])<=t){
                    return true;
                }
            }
        }
        return false;
    }
    */
        public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }

        final TreeSet<Long> values = new TreeSet<>();
        for (int ind = 0; ind < nums.length; ind++) {

            final Long floor = values.floor((long)nums[ind] + t);
            final Long ceil = values.ceiling((long)nums[ind] - t);
            if ((floor != null && floor >= (long)nums[ind])
                    || (ceil != null && ceil <= (long)nums[ind])) {
                return true;
            }

            values.add((long)nums[ind]);
            if (ind >= k) {
                values.remove((long)nums[ind - k]);
            }
        }

        return false;
    }
}
