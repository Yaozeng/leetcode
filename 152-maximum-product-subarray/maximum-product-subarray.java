// Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
//
// Example 1:
//
//
// Input: [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.
//
//
// Example 2:
//
//
// Input: [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
//


class Solution {
    public int maxProduct(int[] nums) {
                
        int prevMax = nums[0];
        int prevMin = nums[0];
        int maxProduct = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            int cur = nums[i];
            
            int maxToCur = Math.max(Math.max(prevMax * cur, prevMin * cur), cur);
            // since the maxCur is changed after the above step, we use two more vars called prevMax, prevMin 
            int minToCur = Math.min(Math.min(prevMax * cur, prevMin * cur), cur);
            maxProduct = Math.max(maxProduct, maxToCur);
            
            prevMax = maxToCur;
            prevMin = minToCur;
        }
        return maxProduct;
    }
}
