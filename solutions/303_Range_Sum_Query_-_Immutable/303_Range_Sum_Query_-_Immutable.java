// Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
//
// Example:
//
// Given nums = [-2, 0, 3, -5, 2, -1]
//
// sumRange(0, 2) -> 1
// sumRange(2, 5) -> -1
// sumRange(0, 5) -> -3
//
//
//
// Note:
//
// You may assume that the array does not change.
// There are many calls to sumRange function.
//
//


class NumArray {
    /*
    int [] dp;
    int [] tmp;
    public NumArray(int[] nums) {
        if(nums.length<1){
            
        dp=new int[]{};}
        else{
            
        dp=new int[nums.length];
        tmp=nums;
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=dp[i-1]+nums[i];
        }
        }
    }
    
    public int sumRange(int i, int j) {
        if(dp.length<1) return 0;
        return dp[j]-dp[i]+tmp[i];
    }*/
        private int[] accumulated;
    public NumArray(int[] nums) {
        accumulated = new int[nums.length + 1];
        accumulated[0] = 0;
        for (int i = 1; i < accumulated.length; i++) {
            accumulated[i] = accumulated[i - 1] + nums[i - 1];
        }
    }
    
    public int sumRange(int i, int j) {
        return accumulated[j + 1] - accumulated[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
