// Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
//
// Example: 
//
//
// Input: s = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: the subarray [4,3] has the minimal length under the problem constraint.
//
// Follow up:
//
// If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n). 
//


class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        /*
        int []dp=new int [nums.length+1];
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            dp[i]=dp[i-1]+nums[i-1];
        }
        for(int i=1;i<=nums.length;i++){
            for(int j=0;j+i<nums.length+1;j++){
                if(dp[j+i]-dp[j]>=s){
                    return i;
                }
            }
        }
        return 0;
        */
        int left=0;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(left<=i&&sum>=s){
                ans=Math.min(ans,i-left+1);
                sum-=nums[left++];
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}
