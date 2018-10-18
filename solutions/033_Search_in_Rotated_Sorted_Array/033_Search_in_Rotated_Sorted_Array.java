// Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//
// (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
//
// You are given a target value to search. If found in the array return its index, otherwise return -1.
//
// You may assume no duplicate exists in the array.
//
// Your algorithm's runtime complexity must be in the order of O(log n).
//
// Example 1:
//
//
// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4
//
//
// Example 2:
//
//
// Input: nums = [4,5,6,7,0,1,2], target = 3
// Output: -1
//


class Solution {
    public int search(int[] nums, int target) {
        if(nums.length<1){
            return -1;
        }
        int l1=0,l2=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                l1=i;
                l2=i+1;
                break;
            }
        }
        int res1=binarySearch(nums,0,l1,target);
        int res2=binarySearch(nums,l2,nums.length-1,target);
        return (res1>=0) ? res1 :((res2>=0)? res2 :-1);
    }
    public int binarySearch(int [] nums,int s,int e,int target){
        int mid;
        while(s<=e){
            mid=(s+e)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}
