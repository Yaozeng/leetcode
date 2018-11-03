// Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
//
// Example 1:
//
//
// Input:
// 11110
// 11010
// 11000
// 00000
//
// Output: 1
//
//
// Example 2:
//
//
// Input:
// 11000
// 11000
// 00100
// 00011
//
// Output: 3
//



class Solution {
    public int numIslands(char[][] grid) {
        int numOFislands = 0;
		int rows = grid.length;
        if(rows == 0) {
            return numOFislands;
        }
		int columns = grid[0].length;
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < columns; ++j) {
				if (grid[i][j] == '1') {
					numOFislands++;
					grid = BFS(grid, i, j);
				}
			}
		}
		return numOFislands;
    }
    
    public char[][] BFS(char[][] grid, int i, int j) {
		grid[i][j] = 0;
		if (j - 1 >= 0 && grid[i][j - 1] == '1')
			grid = BFS(grid, i, j - 1);
		if (i - 1 >= 0 && grid[i - 1][j] == '1')
			grid = BFS(grid, i - 1, j);
		if (i + 1 < grid.length && grid[i + 1][j] == '1')
			grid = BFS(grid, i + 1, j);
		if (j + 1 < grid[0].length && grid[i][j + 1] == '1')
			grid = BFS(grid, i, j + 1);
		return grid;
	}
}
