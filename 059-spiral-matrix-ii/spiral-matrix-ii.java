// Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
//
// Example:
//
//
// Input: 3
// Output:
// [
//  [ 1, 2, 3 ],
//  [ 8, 9, 4 ],
//  [ 7, 6, 5 ]
// ]
//
//


class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if (n == 0) {
            return matrix;
        }
        recursiveGenerate(matrix, 0, n, 1);
        return matrix;
    }
    
    private void recursiveGenerate(int[][] matrix, int offset, int size, int num) {
        
        if (size == 0) {
            return;
        }
        
        if (size == 1) {
            matrix[offset][offset] = num;
            return;
        }
        
        for (int i = 0; i < size - 1; i++) {
            matrix[offset][offset + i] = num++;
        }
        
        for (int i = 0; i < size - 1; i++) {
            matrix[offset + i][offset + size - 1] = num++;
        }
        
        for (int i = size - 1; i > 0; i--) {
            matrix[offset + size - 1][offset + i] = num++;
        }
        
        for (int i = size - 1; i > 0; i--) {
            matrix[offset + i][offset] = num++;
        }
        
        recursiveGenerate(matrix, offset + 1, size - 2, num);
    }
}
