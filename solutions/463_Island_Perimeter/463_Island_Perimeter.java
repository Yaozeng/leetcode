// You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
//
// Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
//
// The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
//
//  
//
// Example:
//
//
// Input:
// [[0,1,0,0],
//  [1,1,1,0],
//  [0,1,0,0],
//  [1,1,0,0]]
//
// Output: 16
//
// Explanation: The perimeter is the 16 yellow stripes in the image below:
//
//
//
//


class Solution {
    /*
    int count=0;
    public int islandPerimeter(int[][] grid) {
        int i=0;
        int j=0;
        for(;i<grid.length;i++){
            for(;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    break;
                }
            }
            break;
        }
        boolean [][] visited =new boolean [grid.length][grid[0].length];
        helper(grid,i,j,visited);
        return count;        
    }
    public void helper(int [][]grid,int i,int j,boolean [][]visited){
            if(count==0){
                count+=4;
            }else{
                count+=3;
            }
            visited[i][j]=true;
            if(j+1<grid[0].length&&grid[i][j+1]!=0&&!visited[i][j+1]){
            count--;
            helper(grid,i,j+1,visited);
        }
                if(j-1>=0&&grid[i][j-1]!=0&&!visited[i][j-1]){
            count--;
            helper(grid,i,j-1,visited);
        }
                if(i+1<grid.length&&grid[i+1][j]!=0&&!visited[i+1][j]){
            count--;
            helper(grid,i+1,j,visited);
        }
                if(i-1>=0&&grid[i-1][j]!=0&&!visited[i-1][j]){
            count--;
            helper(grid,i-1,j,visited);
        }
    }
    */
        public int islandPerimeter(int[][] grid) {
        int islands = 0, neighbours = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islands++; // count islands
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) neighbours++; // count down neighbours
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) neighbours++; // count right neighbours
                }
            }
        }

        return islands * 4 - neighbours * 2;
    }
}
