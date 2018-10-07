// A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
//
// The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
//
// How many possible unique paths are there?
//
//
// Above is a 7 x 3 grid. How many possible unique paths are there?
//
// Note: m and n will be at most 100.
//
// Example 1:
//
//
// Input: m = 3, n = 2
// Output: 3
// Explanation:
// From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
// 1. Right -> Right -> Down
// 2. Right -> Down -> Right
// 3. Down -> Right -> Right
//
//
// Example 2:
//
//
// Input: m = 7, n = 3
// Output: 28
//


class Solution {
    public int uniquePaths(int m, int n) {
        int [][] memo=new int [m+1][n+1];
        return helper(m,n,memo);
    }
        private int helper(int m, int n,int[][]memo){
        if(memo[m][n]!=0){
            return memo[m][n];
        }
        if (m==1 || n==1){
            return 1;
        }
        memo[m][n] = helper(m-1,  n,memo) +helper(m,  n-1,memo);
        return memo[m][n];
    }
}
