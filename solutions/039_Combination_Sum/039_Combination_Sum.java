// Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
//
// The same repeated number may be chosen from candidates unlimited number of times.
//
// Note:
//
//
// 	All numbers (including target) will be positive integers.
// 	The solution set must not contain duplicate combinations.
//
//
// Example 1:
//
//
// Input: candidates = [2,3,6,7], target = 7,
// A solution set is:
// [
//   [7],
//   [2,2,3]
// ]
//
//
// Example 2:
//
//
// Input: candidates = [2,3,5], target = 8,
// A solution set is:
// [
//   [2,2,2,2],
//   [2,3,3],
//   [3,5]
// ]
//
//


class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        if(target<candidates[0])  return res;
        backtrace(res,new ArrayList<Integer>(),candidates,target,0);
        return res;
    }
    public void backtrace(List<List<Integer>> list,List<Integer> tmpList,int [] candidates,int target,int start){
        if(target==0){
            list.add(new ArrayList<Integer>(tmpList));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(candidates[i]<=target){
                tmpList.add(candidates[i]);
                backtrace(list,tmpList,candidates,target-candidates[i],i);
                tmpList.remove(tmpList.size()-1);
            }else{
                break;
            }
        }
        return;
    }
}
