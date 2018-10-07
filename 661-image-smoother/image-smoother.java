// Given a 2D integer matrix M representing the gray scale of an image, you need to design a smoother to make the gray scale of each cell becomes the average gray scale (rounding down) of all the 8 surrounding cells and itself.  If a cell has less than 8 surrounding cells, then use as many as you can.
//
// Example 1:
//
// Input:
// [[1,1,1],
//  [1,0,1],
//  [1,1,1]]
// Output:
// [[0, 0, 0],
//  [0, 0, 0],
//  [0, 0, 0]]
// Explanation:
// For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
// For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
// For the point (1,1): floor(8/9) = floor(0.88888889) = 0
//
//
//
// Note:
//
// The value in the given matrix is in the range of [0, 255].
// The length and width of the given matrix are in the range of [1, 150].
//
//


class Solution {
    public int[][] imageSmoother(int[][] M) {
        if (M == null || M.length == 0 || M[0].length == 0) {
            return M;
        }
        int m = M.length;
        int n = M[0].length;
        int[][] N = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int res = count(M, i, j);
                N[i][j] = res;
            }
        }
        return N;
    }
    private int count(int[][] M, int i0 , int j0) {
        int cells = 0;
        int sum = 0;
        for (int i = Math.max(0, i0 - 1); i <= Math.min(i0 + 1, M.length - 1); i++) {
            for (int j = Math.max(0, j0 - 1); j <= Math.min(j0 + 1, M[0].length - 1); j++) {
                cells++;
                sum += M[i][j];
            }
        }
        return sum / cells;
    }
}
