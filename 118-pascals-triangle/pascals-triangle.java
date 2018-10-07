// Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
//
//
// In Pascal's triangle, each number is the sum of the two numbers directly above it.
//
// Example:
//
//
// Input: 5
// Output:
// [
//      [1],
//     [1,1],
//    [1,2,1],
//   [1,3,3,1],
//  [1,4,6,4,1]
// ]
//
//


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> res=new ArrayList<List<Integer>>();
        if(numRows==0){
            return res;
        }
        res.add(new ArrayList());
        res.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer> cur=new ArrayList<Integer>();
            List<Integer> pre=res.get(i-1);
            cur.add(1);
            for(int j=1;j<i;j++){
                cur.add(pre.get(j)+pre.get(j-1));
            }
            cur.add(1);
            res.add(cur);
        }
        return res;
    }
}
