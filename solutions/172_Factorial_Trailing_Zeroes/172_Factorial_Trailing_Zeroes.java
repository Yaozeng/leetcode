// Given an integer n, return the number of trailing zeroes in n!.
//
// Example 1:
//
//
// Input: 3
// Output: 0
// Explanation: 3! = 6, no trailing zero.
//
// Example 2:
//
//
// Input: 5
// Output: 1
// Explanation: 5! = 120, one trailing zero.
//
// Note: Your solution should be in logarithmic time complexity.
//


class Solution {
    public int trailingZeroes(int n) {
        int ret=0;
        while(n>0){
            ret+=n/5;
            n/=5; //this loop makes sure n/ 5,25,125,625... since each is a power of 5 and have to be counted again until the power
        }
        return ret;
    }
}
