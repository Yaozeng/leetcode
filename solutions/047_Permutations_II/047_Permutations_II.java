// Given a collection of numbers that might contain duplicates, return all possible unique permutations.
//
// Example:
//
//
// Input: [1,1,2]
// Output:
// [
//   [1,1,2],
//   [1,2,1],
//   [2,1,1]
// ]
//
//


class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        backtrace(res,new ArrayList<Integer>(),nums,new ArrayList<Integer>());
        return res;
    }
    public void backtrace(List<List<Integer>> res,List<Integer> tmpList,int []nums,List<Integer> index){
        if(tmpList.size()==nums.length){
            res.add(new ArrayList<Integer>(tmpList));
            return;
        }
        for(int i=0;i<nums.length;i++){
            
            if(!index.contains(i)){
            if(i>0&&nums[i]==nums[i-1]&&!index.contains(i-1)) continue;//强制规定重复的数一个出现顺序
            tmpList.add(nums[i]);
            index.add(i);
            backtrace(res,tmpList,nums,index);
            tmpList.remove(tmpList.size()-1);
            index.remove(index.size()-1);
            }
        }
        return;
    }
}
