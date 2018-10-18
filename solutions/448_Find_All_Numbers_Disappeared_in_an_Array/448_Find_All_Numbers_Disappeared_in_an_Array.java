// Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
//
// Find all the elements of [1, n] inclusive that do not appear in this array.
//
// Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
//
// Example:
//
// Input:
// [4,3,2,7,8,2,3,1]
//
// Output:
// [5,6]
//
//


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int i=0;
        List <Integer> res=new ArrayList<>();
        while(i<nums.length){
            while(i<nums.length-1&&nums[i]==nums[i+1]) i++;
            if(nums[i]==count){
                i++;
                count++;
            }else{
                res.add(count);
                count++;
            }
        }
        if(count<=nums.length){
            for(int j=count;j<=nums.length;j++){
                res.add(j);
            }
        }
        return res;
    }
}
