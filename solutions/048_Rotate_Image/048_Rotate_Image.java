// You are given an n x n 2D matrix representing an image.
//
// Rotate the image by 90 degrees (clockwise).
//
// Note:
//
// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
//
// Example 1:
//
//
// Given input matrix = 
// [
//   [1,2,3],
//   [4,5,6],
//   [7,8,9]
// ],
//
// rotate the input matrix in-place such that it becomes:
// [
//   [7,4,1],
//   [8,5,2],
//   [9,6,3]
// ]
//
//
// Example 2:
//
//
// Given input matrix =
// [
//   [ 5, 1, 9,11],
//   [ 2, 4, 8,10],
//   [13, 3, 6, 7],
//   [15,14,12,16]
// ], 
//
// rotate the input matrix in-place such that it becomes:
// [
//   [15,13, 2, 5],
//   [14, 3, 4, 1],
//   [12, 6, 8, 9],
//   [16, 7,10,11]
// ]
//
//


class Solution {
    public void rotate(int[][] matrix) {
                if(matrix == null|| matrix.length ==0 || matrix[0].length ==0) return;
        int row = matrix.length;
        int col = matrix[0].length;
        if(row != col) return;
        //If we scan along the upper side, the lower side will also be scanned
        //Therefore,the maximum value of i will be 2*i<=row -1
        for(int i =0;i<=(row - i)-1;i++){
            //The lower bound of j should be the same as i.
            //If we scan the left side or left side of the inner loop, the right side will also be scanned.
            //Therefore, the maximum value of j will be as follows
            //i+1 will be the length of the right side have already been scanned with the corresponding i.
            for(int j = i;j<=(row - 1)-(i+1);j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[row-1-j][i];
                matrix[row-1-j][i] = matrix[row-1-i][row-1-j];
                matrix[row-1-i][row-1-j] = matrix[j][row-1-i];
                matrix[j][row-1-i] = temp ;
            }
        }
    }
}
