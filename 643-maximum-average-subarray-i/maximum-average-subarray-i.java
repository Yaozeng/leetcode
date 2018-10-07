//
// Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.
//
//
// Example 1:
//
// Input: [1,12,-5,-6,50,3], k = 4
// Output: 12.75
// Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
//
//
//
// Note:
//
// 1 <= k <= n <= 30,000.
// Elements of the given array will be in the range [-10,000, 10,000].
//
//


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i+k<=nums.length;i++){
            int sum=0;
            for(int j=0;j<k;j++){
                sum+=nums[i+j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return (double)max/k;
    }
}
