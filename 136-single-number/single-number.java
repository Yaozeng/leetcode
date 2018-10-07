// Given a non-empty array of integers, every element appears twice except for one. Find that single one.
//
// Note:
//
// Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
// Example 1:
//
//
// Input: [2,2,1]
// Output: 1
//
//
// Example 2:
//
//
// Input: [4,1,2,1,2]
// Output: 4
//


class Solution {
    public int singleNumber(int[] nums) {
        int [] count=new int[nums.length];
        int m=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count[i]=count[j]=1;
                }
            }
        }
        for(m=0;m<nums.length;m++){
            if(count[m]==0)
                break;
        }
        return nums[m];
    }
}
