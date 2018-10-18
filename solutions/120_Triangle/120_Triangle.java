// Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
//
// For example, given the following triangle
//
//
// [
//      [2],
//     [3,4],
//    [6,5,7],
//   [4,1,8,3]
// ]
//
//
// The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
//
// Note:
//
// Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
//


class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==0) return 0;
        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                int t1=triangle.get(i+1).get(j);
                int t2=triangle.get(i+1).get(j+1);
                int tmp=triangle.get(i).get(j) +(t1>t2 ?t2:t1);
                triangle.get(i).set(j,tmp);
            }
        }
        return triangle.get(0).get(0);
    }
}
