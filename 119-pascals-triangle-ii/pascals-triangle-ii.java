// Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
//
// Note that the row index starts from 0.
//
//
// In Pascal's triangle, each number is the sum of the two numbers directly above it.
//
// Example:
//
//
// Input: 3
// Output: [1,3,3,1]
//
//
// Follow up:
//
// Could you optimize your algorithm to use only O(k) extra space?
//


class Solution {
    public List<Integer> getRow(int rowIndex) {
        List <List<Integer>> res=new ArrayList<List<Integer>>();
        if(rowIndex==0){
            List<Integer> tmp=new ArrayList<>();
            tmp.add(1);
            return tmp;
        }
        res.add(new ArrayList());
        res.get(0).add(1);
        for(int i=1;i<rowIndex+1;i++){
            List<Integer> cur=new ArrayList<Integer>();
            List<Integer> pre=res.get(i-1);
            cur.add(1);
            for(int j=1;j<i;j++){
                cur.add(pre.get(j)+pre.get(j-1));
            }
            cur.add(1);
            res.add(cur);
        }
        return res.get(rowIndex);
    }
}
