//
// An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).
//
// Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.
//
// To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on.  Replace the color of all of the aforementioned pixels with the newColor.
//
// At the end, return the modified image.
//
// Example 1:
//
// Input: 
// image = [[1,1,1],[1,1,0],[1,0,1]]
// sr = 1, sc = 1, newColor = 2
// Output: [[2,2,2],[2,2,0],[2,0,1]]
// Explanation: 
// From the center of the image (with position (sr, sc) = (1, 1)), all pixels connected 
// by a path of the same color as the starting pixel are colored with the new color.
// Note the bottom corner is not colored 2, because it is not 4-directionally connected
// to the starting pixel.
//
//
//
// Note:
// The length of image and image[0] will be in the range [1, 50].
// The given starting pixel will satisfy 0 <= sr < image.length and 0 <= sc < image[0].length.
// The value of each color in image[i][j] and newColor will be an integer in [0, 65535].
//


class Solution {
    /*
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
             boolean [][] visited=new boolean[image.length][image[0].length];
        int [][]image2=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                image2[i][j]=image[i][j];
            }
        }
        floodFill2(image,sr,sc,newColor,visited,image2);
        return image2;
        
    }
    public void floodFill2(int[][] image, int sr, int sc, int newColor,boolean [][] visited,int [][]image2){
                if(sr>=0&&sr<image.length&&sc>=0&&sc<image[0].length&&!visited[sr][sc]){
            image2[sr][sc]=newColor;
            visited[sr][sc]=true;
            if(sc+1<image[0].length&&image[sr][sc]==image[sr][sc+1]){
                floodFill2(image,sr,sc+1,newColor,visited,image2);
            }
                                if(sc-1>=0&&image[sr][sc]==image[sr][sc-1]){
                floodFill2(image,sr,sc-1,newColor,visited,image2);
            }
                                if(sr+1<image.length&&image[sr][sc]==image[sr+1][sc]){
                floodFill2(image,sr+1,sc,newColor,visited,image2);
            }
                                if(sr-1>=0&&image[sr][sc]==image[sr-1][sc]){
                floodFill2(image,sr-1,sc,newColor,visited,image2);
            }
        }
    }
    */
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    
        if(newColor != image[sr][sc])
            helper(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }
    
    public void helper(int[][] graph, int sr, int sc, int newColor, int oldColor) {
        
        if(sr < 0 || sc < 0 || sr >=graph.length || sc >= graph[0].length || graph[sr][sc] != oldColor) return;
        
        if(graph[sr][sc] == oldColor) {
            graph[sr][sc] = newColor; 
        }
        helper(graph,sr, sc+1, newColor, oldColor);
        helper(graph,sr, sc-1, newColor, oldColor);
        helper(graph,sr+1, sc, newColor, oldColor);
        helper(graph,sr-1, sc, newColor, oldColor);
    }
}
