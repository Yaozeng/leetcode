// Given a 2D board and a word, find if the word exists in the grid.
//
// The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
//
// Example:
//
//
// board =
// [
//   ['A','B','C','E'],
//   ['S','F','C','S'],
//   ['A','D','E','E']
// ]
//
// Given word = "ABCCED", return true.
// Given word = "SEE", return true.
// Given word = "ABCB", return false.
//
//


class Solution {
    public boolean exist(char[][] board, String word) {
	if(board==null)
		return false;		
	boolean result = false;
		
	char[] input = word.toCharArray();
	int m = board.length;
	int n = board[0].length;
		
	for(int i=0; i<m ;i++) {
		for(int j=0; j<n; j++) {
			if(helper(board,input,0,i,j))
				result = true;
		}
	}		
	return result;		
}
	
public boolean helper(char[][] board, char[] input, int idx, int i, int j) {

	if(i<0 || j<0 || i>=board.length || j>=board[0].length)
		return false;
		
	if(board[i][j] == input[idx]) {
		char temp = board[i][j];
		board[i][j] = '#';
		if(idx == input.length-1)
			return true;
		else if(helper(board, input, idx+1, i-1, j) || helper(board, input, idx+1, i+1, j)
		|| helper(board, input, idx+1, i, j-1) || helper(board, input, idx+1, i, j+1)){
			return true;
		}
		board[i][j] = temp;
	}
	return false;
}
}
