// A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
//
// The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
//
// Now consider if some obstacles are added to the grids. How many unique paths would there be?
//
//
//
// An obstacle and empty space is marked as 1 and 0 respectively in the grid.
//
// Note: m and n will be at most 100.
//
// Example 1:
//
//
// Input:
// [
//   [0,0,0],
//   [0,1,0],
//   [0,0,0]
// ]
// Output: 2
// Explanation:
// There is one obstacle in the middle of the 3x3 grid above.
// There are two ways to reach the bottom-right corner:
// 1. Right -> Right -> Down -> Down
// 2. Down -> Down -> Right -> Right
//
//


class Solution {
    /*
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int [][]memo=new int [obstacleGrid.length+1][obstacleGrid[0].length];
        helper(obstacleGrid.length,obstacleGrid[0].length,memo,obstacleGrid,0,0);
        return 
    }
        private int helper(int m, int n,int[][]memo,int [] []obstacleGrid,int startx,int starty){
        if(memo[m][n]!=0){
            return memo[m][n];
        }
        if (m==1){
            for(int i=starty;i<obstacleGrid[0].length;i++){
                if(obstacleGrid[startx][i]==1) return 0;
            }
            return 1;
        }
            if(n==1){
                        for(int i=startx;i<obstacleGrid.length;i++){
                if(obstacleGrid[i][starty]==1) return 0;
            }
            return 1;    
        }
        if(obstacleGrid[startx][starty+1]!=1&&obstacleGrid[startx+1][starty]!=1){
            memo[m][n] = helper(m-1,  n,memo,obstacleGrid,startx+1,starty) +helper(m,  n-1,memo,obstacleGrid,startx,starty+1);
        }else if(obstacleGrid[startx][starty+1]!=1&&obstacleGrid[startx+1][starty]==1){
            memo[m][n] = helper(m,n-1,memo,obstacleGrid,startx,starty+1);
        }else if(obstacleGrid[startx][starty+1]==1&&obstacleGrid[startx+1][starty]!=1){
            memo[m][n] = helper(m-1,n,memo,obstacleGrid,startx,starty+1);
        }else{
            return 0;
        }
    }*/
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int width = obstacleGrid[0].length;
    int[] dp = new int[width];
    dp[0] = 1;
    for (int[] row : obstacleGrid) {
        for (int j = 0; j < width; j++) {
            if (row[j] == 1)
                dp[j] = 0;
            else if (j > 0)
                dp[j] += dp[j - 1];
        }
    }
    return dp[width - 1];
}
}
