// Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//
// You may assume that the array is non-empty and the majority element always exist in the array.
//
// Example 1:
//
//
// Input: [3,2,3]
// Output: 3
//
// Example 2:
//
//
// Input: [2,2,1,1,1,2,2]
// Output: 2
//
//


class Solution {
    public int majorityElement(int[] nums) {
        Map <Integer,Integer> res=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(res.containsKey(nums[i])){
                res.put(nums[i],res.get(nums[i])+1);
            }else{
                res.put(nums[i],1);
            }
        }
        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
        
    }
}
