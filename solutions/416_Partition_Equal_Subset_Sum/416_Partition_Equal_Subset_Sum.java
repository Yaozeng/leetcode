// Given a non-empty array containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.
//
//
// Note:
//
// Each of the array element will not exceed 100.
// The array size will not exceed 200.
//
//
//
// Example 1:
//
// Input: [1, 5, 11, 5]
//
// Output: true
//
// Explanation: The array can be partitioned as [1, 5, 5] and [11].
//
//
//
// Example 2:
//
// Input: [1, 2, 3, 5]
//
// Output: false
//
// Explanation: The array cannot be partitioned into equal sum subsets.
//
//


class Solution {
    /*
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        return count(nums,sum/2,0,0);
    }
    public boolean count(int [] nums,int target,int i,int sum){
        if(target==sum){
            return true;
        }else{
            if(i==nums.length){
                return false;
            }
        }
       return  count(nums,target,i+1,sum+nums[i]) || count(nums,target,i+1,sum);
    }
    */
        public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
            int n = nums.length;
            sum/=2;
    boolean[] dp = new boolean[sum+1];
            Arrays.fill(dp,false);
    dp[0] = true;    
    for (int num : nums) {
        for (int i = sum; i > 0; i--) {
            if (i >= num) {
                dp[i] = dp[i] || dp[i-num];
            }
        }
    }
    
    return dp[sum];

        
    }
    
    
}
