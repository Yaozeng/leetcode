// Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
//
// Your algorithm's runtime complexity must be in the order of O(log n).
//
// If the target is not found in the array, return [-1, -1].
//
// Example 1:
//
//
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
//
// Example 2:
//
//
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
//


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res=binarySearch(nums,target);
        int i=res,j=res;
        if(res<0){
            return new int[]{-1,-1};
        }
        for(int k=res+1;k<nums.length;k++){
            if(nums[k]==nums[res]){
                j=k;
            }else{
                break;
            }
        }
                for(int k=res-1;k>=0;k--){
            if(nums[k]==nums[res]){
                i=k;
            }else{
                break;
            }
        }
        return new int []{i,j};
    }
    public int binarySearch(int [] nums,int target){
        int mid;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return -1;
    }
}
