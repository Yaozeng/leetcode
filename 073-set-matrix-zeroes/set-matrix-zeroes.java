// Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
//
// Example 1:
//
//
// Input: 
// [
//   [1,1,1],
//   [1,0,1],
//   [1,1,1]
// ]
// Output: 
// [
//   [1,0,1],
//   [0,0,0],
//   [1,0,1]
// ]
//
//
// Example 2:
//
//
// Input: 
// [
//   [0,1,2,0],
//   [3,4,5,2],
//   [1,3,1,5]
// ]
// Output: 
// [
//   [0,0,0,0],
//   [0,4,5,0],
//   [0,3,1,0]
// ]
//
//
// Follow up:
//
//
// 	A straight forward solution using O(mn) space is probably a bad idea.
// 	A simple improvement uses O(m + n) space, but still not the best solution.
// 	Could you devise a constant space solution?
//
//


class Solution {
    public void setZeroes(int[][] matrix) {
        int [][] copy=new int [matrix.length][matrix[0].length];
                for(int i=0;i<copy.length;i++){
            for(int j=0;j<copy[0].length;j++){
copy[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<copy.length;i++){
            for(int j=0;j<copy[0].length;j++){
                if(copy[i][j]==0){
                    for(int k=0;k<copy[0].length;k++){
                        matrix[i][k]=0;
                    }
                    for(int k=0;k<copy.length;k++){
                        matrix[k][j]=0;
                    }
                }
            }
        }
    }
}
