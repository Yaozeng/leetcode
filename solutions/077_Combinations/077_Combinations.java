// Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
//
// Example:
//
//
// Input: n = 4, k = 2
// Output:
// [
//   [2,4],
//   [3,4],
//   [2,3],
//   [1,2],
//   [1,3],
//   [1,4],
// ]
//
//


class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        backtrace(res,new ArrayList<Integer>(),n,1,k);
        return res;
    }
    public void backtrace(List<List<Integer>> list,List<Integer> tmpList,int target,int start,int length){
        if(tmpList.size()==length){
            list.add(new ArrayList<Integer>(tmpList));
            return;
        }
        for(int i=start;i<=target;i++){
                tmpList.add(i);
                backtrace(list,tmpList,target,i+1,length);
                tmpList.remove(tmpList.size()-1);
        }
        return;
    }
}
