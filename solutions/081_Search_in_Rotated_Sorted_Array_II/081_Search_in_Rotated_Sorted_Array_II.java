// Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//
// (i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).
//
// You are given a target value to search. If found in the array return true, otherwise return false.
//
// Example 1:
//
//
// Input: nums = [2,5,6,0,0,1,2], target = 0
// Output: true
//
//
// Example 2:
//
//
// Input: nums = [2,5,6,0,0,1,2], target = 3
// Output: false
//
// Follow up:
//
//
// 	This is a follow up problem to Search in Rotated Sorted Array, where nums may contain duplicates.
// 	Would this affect the run-time complexity? How and why?
//
//


class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length<=0){
            return false;
        }
        int half=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                half=i;
                break;
            }
        }
        int res1=binarySearch(nums,0,half,target);
        int res2=binarySearch(nums,half+1,nums.length-1,target);
        return res1>=0 ? true :  res2>=0?true:false;
    }
    public int binarySearch(int [] nums,int i,int j,int target ){        
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                j=mid-1;
                while(j>0&&nums[j]==nums[j-1]) j--;
            }else{
                i=mid+1;
                while(i<nums.length-1&&nums[i]==nums[i+1]) i++;
            }
        }
        return -1;
    }
}
